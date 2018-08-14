package com.example.sampleapplication.envelope;


import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;
import com.example.sampleapplication.exception.productNotFoundException;
import com.example.sampleapplication.entity.Product;

import java.util.List;


public class productEnvelope {

    public productEnvelope(List<Product> lp) {
        this.lp = lp;
    }

    private Product p;
    private String error;
    private List<Product> lp;


    public productEnvelope(Product p)
    {
        this.p=p;
    }

    public List<Product> getLp() {
        return lp;
    }

    public void setLp(List<Product> lp) {
        this.lp = lp;
    }

    public productEnvelope(String error)
    {
        this.error=error;
    }



}
