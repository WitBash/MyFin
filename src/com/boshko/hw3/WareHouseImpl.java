package com.boshko.hw3;

public class WareHouseImpl implements Warehouse {
    @Override
    public Product getProduct(EnumProduct product) {
        Product  newProduct = null;
        switch (product) {
            case SHAMPOO: newProduct = new IndustrialProduct(); break;
            case MILK: newProduct = new FoodProduct(); break;
        }
        return newProduct;
    }
}
