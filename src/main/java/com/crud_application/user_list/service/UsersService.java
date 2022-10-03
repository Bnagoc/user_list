package com.crud_application.user_list.service;

import com.crud_application.user_list.dto.UsersDto;

import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto);

    void deleteUser(Integer Id);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
