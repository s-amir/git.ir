package com.example.gitrestproject;

import com.example.gitrestproject.entity.product;
import com.example.gitrestproject.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitrestprojectApplication implements CommandLineRunner {

    productRepository productRepository;
     @Autowired
    public void setProductRepository(productRepository productRepository) {
        this.productRepository = productRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(GitrestprojectApplication.class, args); }



    @Override
    public void run(String... args) throws Exception {

         product product=new product();
        product.setName("z4");
        product.setType("car");
        product.setPrice(2860);

        productRepository.save(product);
    }





}



