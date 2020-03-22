package com.boshko.hw3;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = Merchandiser.getInstance().createWarehouse();
        for (EnumProduct enumProduct : EnumProduct.values()) {
            Product  product = warehouse.getProduct(enumProduct);
            product.info();
        }
    }
}
