package org.dinuka.userk8scicdaws.util;

import org.dinuka.userk8scicdaws.dto.UserDto;
import org.dinuka.userk8scicdaws.modal.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
