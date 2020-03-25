package com.boshko.hw4;

public class FoodProduct extends Product {

    public FoodProduct(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String info() {
        return "Milk";
    }

    public String getManufacturer(){
        return manufacturer.getManufacturer();
    }
}
