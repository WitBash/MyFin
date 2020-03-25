package com.boshko.hw5;

public class Merchandiser {
    private static final Merchandiser OUR_INSTANCE = new Merchandiser();
    private final Warehouse WAREHOUSE = new WareHouseImpl();

    public static Merchandiser getInstance() {
        return OUR_INSTANCE;
    }

    private Merchandiser() {
    }

    public Warehouse createWarehouse() {
        return WAREHOUSE;
    }
}
