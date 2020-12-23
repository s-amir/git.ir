package com.example.gitrestproject.repository;

import com.example.gitrestproject.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product,String> {

}
