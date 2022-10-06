package com.crud_application.user_list.service;

import com.crud_application.user_list.dto.UsersDto;
import com.crud_application.user_list.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        return UsersDto.builder()
                .id(users.getId())
                .email(users.getEmail())
                .name(users.getName())
                .login(users.getLogin())
                .build();
    }
}
