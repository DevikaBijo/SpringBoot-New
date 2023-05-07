package com.UST.RealEstate.service;

import com.UST.RealEstate.entity.Company;
import com.UST.RealEstate.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CompanyService {
    @Autowired
    private CompanyRepo repo;


    public List<Company> getByZipCode(Double zipcode) {
//        return repo.findByZipcode(zipcode);
          return repo.findAll()
                .stream()
                .filter(c -> c.getZipcode().equals(zipcode))
                .collect(Collectors.toList());
    }

    public List<Company> getByState(String state) {
//        return repo.findByState(state);
          return repo.findAll()
                .stream()
                .filter(c -> c.getState().equals(state))
                .collect(Collectors.toList());
    }

    public List<Company> getByCity(String city) {
//        return repo.findByCity(city);
          return repo.findAll()
                .stream()
                .filter(c -> c.getCity().equals(city))
                .collect(Collectors.toList());
    }
    public List<Company> getByPrice(Double price) {
//        return repo.findByPrice(price);
          return repo.findAll()
                .stream()
                .filter(c -> c.getPrice().equals(price))
                .collect(Collectors.toList());
    }

    public List<Company> getByBed() {
//        return repo.findByBed(bed);
         return repo.findAll()
                .stream()
                .filter(c -> c.getBed()==4)
                .collect(Collectors.toList());

    }
    public List<Company> getByBath() {
//        return repo.findByBed(bath);
          return repo.findAll()
                .stream()
                .filter(c -> c.getBath()==2)
                .collect(Collectors.toList());
    }

    public List<Company> getBySales(String city) {
        return repo.findByCity(city)
                .stream()
                .filter(c -> c.getStatus().equals("for_sale"))
                .collect(Collectors.toList())
                .count();

    }
}

