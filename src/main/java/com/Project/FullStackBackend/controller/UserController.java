package com.Project.FullStackBackend.controller;

import com.Project.FullStackBackend.exception.UserNotFoundException;
import com.Project.FullStackBackend.model.User;
import com.Project.FullStackBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/getUsers")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/getUser/{id}")
    User getUserById(@PathVariable long id) {
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping("/modifyUser/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return userRepository.findById(id)
                .map(user->{
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }
}
