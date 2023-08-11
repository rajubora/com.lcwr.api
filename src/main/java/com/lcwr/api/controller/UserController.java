package com.lcwr.api.controller;


import com.lcwr.api.model.PostOfficeResponse;
import com.lcwr.api.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postal")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;
@GetMapping("/city")
    public PostOfficeResponse getPostalByCity(@RequestParam String city){

    PostOfficeResponse postOfficeResponse= userServiceImpl.FetchPostOfficeDetailsByCity(city);

        return  postOfficeResponse;
    }




}
