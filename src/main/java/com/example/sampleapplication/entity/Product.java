package com.example.sampleapplication.entity;

import java.util.List;
import java.util.UUID;

public class Product {

    UUID pid;
    List<Product> lp;

    public Product()
    {

    }

    public List<Product> getLp() {
        return lp;
    }

    public void setLp(List<Product> lp) {
        this.lp = lp;
    }

    public Product(List<Product> lp)
    {
        this.lp=lp;
    }
    public Product(UUID pid,String pname,String brand,int price) {
        this.pid=pid;
        this.pname=pname;
        this.brand=brand;
        this.price=price;
    }


    String pname;


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    String brand;
    int price;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public UUID getPid() {
        return pid;
    }

    public void setPid(UUID pid) {
        this.pid = pid;
    }


}
