package com.linguaworld.auth.service.dto.impl;

import com.linguaworld.auth.entity.User;
import com.linguaworld.auth.repository.UserRepository;
import com.linguaworld.auth.rest.dto.UserDto;
import com.linguaworld.auth.service.dto.UserDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDtoServiceImpl implements UserDtoService {

    private UserRepository userRepo;

    @Autowired
    public UserDtoServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<UserDto> getAll() {
        /*return userRepo.findAll().stream()
                .map(user -> new UserDto() {{
                    setLogin(user.getLogin());
                    setPassword(user.getPassword());
                }})
                .collect(Collectors.toList());*/

        List<UserDto> userDtoList = new ArrayList<>();

        return userDtoList;
    }
}
