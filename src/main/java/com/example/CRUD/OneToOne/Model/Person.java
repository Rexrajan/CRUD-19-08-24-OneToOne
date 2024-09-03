package com.example.CRUD.OneToOne.Model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_Id")
    private Integer id;

    private String name;

    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adhaar_id")
    private Adhaar adhaar;


    public Integer getId(){
        return id;
    }

    public void setId(Integer idNo){
        id = idNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer a){
        age = a;
    }

    public Adhaar getAdhaar(){
        return adhaar;
    }

    public void setAdhaar(Adhaar adhaar){
        this.adhaar = adhaar;
    }
}
