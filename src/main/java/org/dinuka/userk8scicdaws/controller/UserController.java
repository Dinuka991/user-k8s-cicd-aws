package org.dinuka.userk8scicdaws.controller;

import org.dinuka.userk8scicdaws.dto.UserDto;
import org.dinuka.userk8scicdaws.modal.User;
import org.dinuka.userk8scicdaws.service.UserService;
import org.dinuka.userk8scicdaws.util.UserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/save")
    ResponseEntity<User> saveUser(@RequestBody UserDto userDto) {
        User user = UserMapper.INSTANCE.toEntity(userDto);
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/all")
    ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok( userService.getAllUsers().stream()
                .map(UserMapper.INSTANCE::toDto).collect(Collectors.toList())) ;
    }

    @GetMapping("/get/{id}")
    ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(UserMapper.INSTANCE.toDto(userService.getUserById(id)));
    }

}
