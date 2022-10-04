package com.crud_application.user_list.service;

import com.crud_application.user_list.dto.UsersDto;
import javax.xml.bind.ValidationException;
import static java.util.Objects.isNull;

public class DefaultUsersService {

    public void validateUserDto(UsersDto usersDto) throws ValidationException {
        if (isNull(usersDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(usersDto.getLogin()) || usersDto.getLogin().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }


}
