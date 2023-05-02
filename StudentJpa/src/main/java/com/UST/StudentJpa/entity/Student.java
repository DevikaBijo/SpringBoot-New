package com.UST.StudentJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student_Details")

public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phoneNum;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> courses;
    private String address;
    private String comments;


}
