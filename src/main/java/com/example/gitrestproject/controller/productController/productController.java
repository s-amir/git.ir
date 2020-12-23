package com.example.gitrestproject.controller.productController;

import com.example.gitrestproject.Service.productService.ProductService;
import com.example.gitrestproject.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/productcontroller")
public class productController {

    ProductService productService;
@Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/getproduct/{id}",method = RequestMethod.GET)
    public product getProduct(@PathVariable(name = "id") String id){
    return productService.getProduct(id);

    }
    @RequestMapping(path = "/saveproduct", consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public void saveProduct(@RequestBody product product){
    productService.saveProduct(product);
    }

    @RequestMapping(path = "/updateproduct/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.PUT)
    public product updateProduct(@PathVariable(name = "id") String id,@RequestBody product product){
    return productService.updateProduct(product,id);
    }
    @RequestMapping(path = "/deleteproduct/{id}",method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(name = "id") String id){
    productService.deleteProduct(id);
    }



}
