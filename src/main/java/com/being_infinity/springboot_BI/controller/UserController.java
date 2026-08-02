package com.being_infinity.springboot_BI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.being_infinity.springboot_BI.models.User;
import com.being_infinity.springboot_BI.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/random")
    public ResponseEntity<User> getRandomUser() {

        User user = userService.getRandomUser();

        if (user != null) {
            return ResponseEntity.ok(user);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public User addUser(@RequestBody User newUser) {
        return userService.addNewUser(newUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id,
                                           @RequestBody User updatedUser) {

        User temp = userService.updateUser(id, updatedUser);

        if (temp != null) {
            return ResponseEntity.ok(temp);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable int id) {

        boolean deleted = userService.deleteUser(id);

        if (deleted) {
            return ResponseEntity.ok(true);
        }

        return ResponseEntity.notFound().build();
    }
}