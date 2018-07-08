package com.linguaworld.auth.service.dto;

import com.linguaworld.auth.rest.dto.UserDto;

import java.util.List;

public interface UserDtoService {
    List<UserDto> getAll();
}
