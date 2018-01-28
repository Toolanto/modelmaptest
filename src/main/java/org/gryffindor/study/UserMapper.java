package org.gryffindor.study;

import org.modelmapper.ModelMapper;

public class UserMapper {


    public User map(UserDto userDto) {
        return new ModelMapper().map(userDto, User.class);
    }

    public UserDto map(User user) {
        return new ModelMapper().map(user, UserDto.class);
    }
}
