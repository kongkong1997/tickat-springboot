package com.java.tickat.service;

import com.java.tickat.model.TblUserEntity;
import com.java.tickat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional add(TblUserEntity user) {
        String passwordHash =  passwordToHash(user.getPassword());
        user.setPassword(passwordHash);
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }

    private String passwordToHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(password.getBytes());
            byte[] src = digest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            // 字节数组转16进制字符串
            // https://my.oschina.net/u/347386/blog/182717
            for (byte aSrc : src) {
                String s = Integer.toHexString(aSrc & 0xFF);
                if (s.length() < 2) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException ignore) {
        }
        return null;
    }

    public Optional<TblUserEntity> findById(String id) {
        TblUserEntity user = new TblUserEntity();
        user.setId(id);
        return userRepository.findById(user.getId());
    }

    public TblUserEntity findByName(String name) {
        TblUserEntity param = new TblUserEntity();
        param.setNickname(name);
        return userRepository.findOneByNickname(param.getNickname());
    }

    public boolean comparePassword(TblUserEntity user, TblUserEntity userInDataBase) {
        return passwordToHash(user.getPassword())      // 将用户提交的密码转换为 hash
                .equals(userInDataBase.getPassword()); // 数据库中的 password 已经是 hash，不用转换
    }
}
