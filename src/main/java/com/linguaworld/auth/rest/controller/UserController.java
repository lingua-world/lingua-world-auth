package com.linguaworld.auth.rest.controller;

import com.linguaworld.auth.rest.dto.UserDto;
import com.linguaworld.auth.service.dto.UserDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/api/users")
public class UserController {

    private UserDtoService userDtoService;

    @Autowired
    public UserController(UserDtoService userDtoService) {
        this.userDtoService = userDtoService;
    }

    @GetMapping
    List<UserDto> getAllUsers() {
        /*List<UserDto> userDtoList = new ArrayList<>();
        userDtoList.add(new UserDto("Anton Rynkovoy", "qwerty"));
        userDtoList.add(new UserDto("Michael Omelchenko", "123456"));*/

        return userDtoService.getAll();
    }
}
