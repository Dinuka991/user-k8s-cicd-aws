package org.dinuka.userk8scicdaws.service;

import org.dinuka.userk8scicdaws.exception.UserNotFoundException;
import org.dinuka.userk8scicdaws.modal.User;
import org.dinuka.userk8scicdaws.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id)  {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found"));
    }
}