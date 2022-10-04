package com.crud_application.user_list.service;

import com.crud_application.user_list.dto.UsersDto;

import javax.xml.bind.ValidationException;
import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer Id);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
