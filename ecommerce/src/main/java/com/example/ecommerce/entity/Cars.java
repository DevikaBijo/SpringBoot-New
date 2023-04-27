package com.example.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {
    @Id
    private int carid;
    private String carName;
    private int year;
    @ElementCollection
    private List<String>colors;
    private String model;
    @ElementCollection
    private List<String>accessories;
    private int price;
    @ElementCollection
    private List<String>payment;
    @ElementCollection
    private List<String>cities;
}
