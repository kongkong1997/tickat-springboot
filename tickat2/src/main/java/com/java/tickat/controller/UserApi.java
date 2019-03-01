package com.java.tickat.controller;

import com.alibaba.fastjson.JSONObject;
import com.java.tickat.model.TblUserEntity;
import com.java.tickat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/api/user")
public class UserApi {
    private UserService userService;

    @Autowired
    public UserApi(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    @ResponseBody
    public Object add(@Valid TblUserEntity user) {
        userService.add(user);
        if (userService.findByName(user.getNickname()) == null) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("type","1");
            jsonObject.put("message","UnexpectedError");
            return jsonObject;
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type","1");
        jsonObject.put("message","OK");
        return jsonObject;

    }

    @PostMapping("/signup/validate")
    public Object add(@RequestBody String username) throws IOException {
            if (userService.findByName(username) != null) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type", "1");
                jsonObject.put("message", "UsernameExisting");
                return jsonObject;
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("type", "0");
            jsonObject.put("message", "OK");
            return jsonObject;
    }

    @GetMapping("{id}")
    public Object findById(@PathVariable String id) {
        return userService.findById(id);
    }
}