package com.example.sampleapplication.service;
import  com.example.sampleapplication.exception.productNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import com.example.sampleapplication.exception.productNotFoundException;
import com.example.sampleapplication.entity.Product;

@Service
public class productService{


    public Product getinformation (UUID id)throws productNotFoundException
    {


            if(id.equals(UUID.fromString("78c530c6-badc-4557-9ddb-71eac8918e00")))
                return new Product(UUID.fromString("78c530c6-badc-4557-9ddb-71eac8918e00"),"shirt","oldnavy",3000);
            else
                throw new productNotFoundException("product not found");
    }
    public List<Product> addChoice(List<Product> ps)
    {
        Product l=new Product();
        l.setLp(ps);
        return l.getLp();
    }


}
