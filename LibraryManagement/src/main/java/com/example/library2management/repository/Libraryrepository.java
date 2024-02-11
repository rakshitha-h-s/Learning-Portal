package com.example.library2management.repository;

import org.springframework.stereotype.Repository;
import com.example.library2managment.entity.Entityclass;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Libraryrepository extends JpaRepository<Entityclass,Long>{

}
