package com.boshko.hw4;

public class Main {

    public static void main(String[] args) {

        for (EnumManufacturer enumManufacturer : EnumManufacturer.values()) {
            switch (enumManufacturer) {
                case SCHWARZKOPF:
                    getManufacturer(new Schwarzkopf());
                    break;
                case PROCTER_AND_GAMBLE:
                    getManufacturer(new PAndG());
                    break;
                case DOMIK_V_DEREVNE:
                    getManufacturer(new DomikVDerevne());
                    break;
                case PROSTOKVASHINO:
                    getManufacturer(new Prostokvashino());
                    break;
            }
        }
    }

    private static void getManufacturer(Manufacturer manufacturer) {

        switch (manufacturer.getClass().getSimpleName()) {
            case "Schwarzkopf":
                IndustrialProduct industrialProduct = new IndustrialProduct(manufacturer);
                System.out.printf("Product : %s, Manufacturer : %s;\n", industrialProduct.info(), industrialProduct.getManufacturer());
                break;
            case "PAndG":
                IndustrialProduct industrialProduct2 = new IndustrialProduct(manufacturer);
                System.out.printf("Product : %s, Manufacturer : %s;\n", industrialProduct2.info(), industrialProduct2.getManufacturer());
                break;
            case "DomikVDerevne":
                FoodProduct foodProduct = new FoodProduct(manufacturer);
                System.out.printf("Product : %s, Manufacturer : %s;\n", foodProduct.info(), foodProduct.getManufacturer());
                break;
            case "Prostokvashino":
                FoodProduct foodProduct2 = new FoodProduct(manufacturer);
                System.out.printf("Product : %s, Manufacturer : %s;", foodProduct2.info(), foodProduct2.getManufacturer());
                break;

        }
    }
}

