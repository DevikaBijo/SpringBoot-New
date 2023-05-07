package com.UST.RealEstate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="realtor_data")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String status;
    private Double bed;
    private Double bath;
    private Double acre_lot;
    private String city;
    private String state;
    @Column(name="zip_code")
    private Double zipcode;
    private String house_size;
    private String prev_sold_date;
    private Double price;



}
