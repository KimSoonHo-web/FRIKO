package com.owol.friko.app.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.owol.friko.app.user.service.UserService;
import com.owol.friko.app.user.vo.User;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private UserService userService;

    @GetMapping("/{userNo}")
    public ResponseEntity<User> getUser(@PathVariable String userNo) {
        User user = userService.getUserByUserNo(userNo);
      
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

}
