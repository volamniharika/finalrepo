package com.example.sampleapplication.productcontroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.sampleapplication.service.*;
import com.example.sampleapplication.envelope.productEnvelope;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;
import com.example.sampleapplication.entity.Product;
import com.example.sampleapplication.exception.productNotFoundException;
import com.example.sampleapplication.service.productService;





@RestController
public class productController {


    @Autowired
    productService productservice;

    @RequestMapping(value = "/getproduct/{pid}", method = RequestMethod.GET)
    public ResponseEntity<productEnvelope> getProduct(@PathVariable(value = "pid") UUID ccid) throws productNotFoundException {


        Product p=productservice.getinformation(ccid);
        productEnvelope productenvelope = new productEnvelope(p);

                return ResponseEntity.ok(productenvelope);




    }
    @RequestMapping(value="/addchoice",method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<productEnvelope> addchoice(@RequestBody List<Product> p)
    {
        List<Product> productlist=productservice.addChoice(p);
        productEnvelope p1=new productEnvelope(productlist);
        return ResponseEntity.ok(p1);
    }




    }
