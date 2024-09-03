package com.example.CRUD.OneToOne.Repository;
import com.example.CRUD.OneToOne.Model.Adhaar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdhaarRepository extends JpaRepository<Adhaar,Integer> {

}
