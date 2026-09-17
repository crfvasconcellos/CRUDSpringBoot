package com.crfvasconcellos.crudspringboot.resources;

import com.crfvasconcellos.crudspringboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findALl(){

        User u = new User(1L,"Mario","mariogames@gmail.com","999999999","123456");
        return ResponseEntity.ok().body(u);
    }

}
