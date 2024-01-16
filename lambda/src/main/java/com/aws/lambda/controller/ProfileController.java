package com.aws.lambda.controller;

import java.util.List;

import com.aws.lambda.data.UserDet;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class ProfileController {

    @GetMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDet> getUser() {
        return List.of(new UserDet("John", "Doe", "john.doe@baeldung.com"), new UserDet("John", "Doe", "john.doe-2@baeldung.com"));
    }

}