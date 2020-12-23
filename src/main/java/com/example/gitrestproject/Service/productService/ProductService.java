package com.example.gitrestproject.Service.productService;

import com.example.gitrestproject.entity.product;
import com.example.gitrestproject.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private productRepository productRepository;

    public void setProductRepository(com.example.gitrestproject.repository.productRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(product product){
        productRepository.save(product);
    }
    public product getProduct(String id){
        return productRepository.getOne(id);
    }
    public product updateProduct(product product,String id){
        if(product!=null){
            product productToUpdate=getProduct(id);
            productToUpdate.setName(product.getName());
            productToUpdate.setType(product.getType());
            productToUpdate.setPrice(product.getPrice());
            return productRepository.save(productToUpdate);

        }
        return product;
    }

    public void deleteProduct(String id){
        product productToDelete= productRepository.getOne(id);
        if(productToDelete!=null){
            productRepository.delete(productToDelete);
        }
    }
}





