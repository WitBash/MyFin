package com.boshko.hw5;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = Merchandiser.getInstance().createWarehouse();
        warehouse.attach(new WareHouseManager());
        warehouse.attach(new PushClient());
        for (EnumProduct enumProduct : EnumProduct.values()) {
            Product product = warehouse.getProduct(enumProduct);
            product.info();
        }
    }
}
