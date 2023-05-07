package com.UST.RealEstate.controller;

import com.UST.RealEstate.entity.Company;
import com.UST.RealEstate.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService service;
    @GetMapping("/get/{zipcode}")
    public List<Company> getByZipCode(@PathVariable Double zipcode){

        return service.getByZipCode(zipcode);
    }
    @GetMapping("/getstate/{state}")
    public List<Company> getByState(@PathVariable String state){
       return service.getByState(state);

    }
    @GetMapping("/getcity/{city}")
    public List<Company>getByCity(@PathVariable String city){
        return service.getByCity(city);
    }
    @GetMapping("/getprice/{price}")
    public List<Company>getByPrice(@PathVariable Double price){
        return service.getByPrice(price);
    }
    @GetMapping("/getbed/{bed}")
    public List<Company>getByBed(){
        return service.getByBed();
    }
    @GetMapping("/getbath/{bath}")
    public List<Company>getByBath(){
        return service.getByBath();
    }
    @GetMapping("/getsales/{city}")
    public List<Company>getBySales(@PathVariable String city){
        return service.getBySales(city);
    }




}
