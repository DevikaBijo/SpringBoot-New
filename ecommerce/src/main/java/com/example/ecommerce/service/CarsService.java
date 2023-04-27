package com.example.ecommerce.service;

import com.example.ecommerce.entity.Cars;
import com.example.ecommerce.repository.CarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService {
    @Autowired
    private CarsRepo repo;
    public Cars getalldetails(Cars cars)
    {
      return  repo.save(cars);
    }
}
