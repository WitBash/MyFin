package com.boshko.hw4;

public abstract class Product {
    Manufacturer manufacturer;

    public Product(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    abstract String info();
}
