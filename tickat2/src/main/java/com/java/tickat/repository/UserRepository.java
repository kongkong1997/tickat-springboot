package com.java.tickat.repository;

import com.java.tickat.model.TblUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TblUserEntity,String> {

    TblUserEntity findOneByNickname(String nickname);
}
