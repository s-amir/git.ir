package com.example.gitrestproject.repository;

import com.example.gitrestproject.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends JpaRepository<product,String> {

    product findByName(String name);                         //automatically do it without any implementation
    List<product> findByTypeAndName(String type,String name);
    List<product> findByTypeAndNameIn(String type,List<String> name);

}
