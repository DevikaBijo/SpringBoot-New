package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Cars;
import com.example.ecommerce.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarsController
{
    @Autowired
    private CarsService service;
    @PostMapping("/details")
    public Cars getalldetails(@RequestBody Cars cars)
    {
        return service.getalldetails(cars);
    }



}
