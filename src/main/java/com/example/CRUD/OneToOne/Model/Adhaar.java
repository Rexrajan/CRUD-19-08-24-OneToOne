package com.example.CRUD.OneToOne.Model;

import jakarta.persistence.*;

@Entity
public class Adhaar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long adhaarNumber;

    public Integer getId(){
        return id;
    }

    public void setId(Integer idNo){
        id = idNo;
    }
    public Long getAdhaarNumber(){
        return adhaarNumber;
    }
    public void setAdhaarNumber(Long adhaar){
        adhaarNumber = adhaar;
    }
}
