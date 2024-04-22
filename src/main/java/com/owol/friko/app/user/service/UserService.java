package com.owol.friko.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owol.friko.app.user.mapper.UserMapper;
import com.owol.friko.app.user.vo.User;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserByUserNo(String userNo) {
        return userMapper.getUserByUserNo(userNo);
    }
}
