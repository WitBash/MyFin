package com.boshko.hw4;

public class IndustrialProduct extends Product {

    public IndustrialProduct(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String info() {
        return "Shampoo";
    }

    public String getManufacturer(){
        return manufacturer.getManufacturer();
    }
}
