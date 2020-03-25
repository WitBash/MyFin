package com.boshko.hw5;

import java.util.HashMap;
import java.util.Map;

public class WareHouseImpl extends Warehouse {
    //Список наличия продуктов
    private Map<Product, Integer> map = new HashMap<>();

    //список с минимально допустимым количеством по продуктам на складе
    private Map<Product, Integer> mapCriticalAmount = new HashMap<>();

    private int amount;
    private int criticalAmount;

    public int getAmountProduct(EnumProduct product) {
        //...проходим по map и возвращаем количество продукта
        return amount;
    }

    public void setAmount(EnumProduct product, int amount) {
        //проходим по списку продуктов и устанавливаем новое значение количества
        //.........
        this.amount = amount;
        //проверка объема продукта в остатке
        if (getAmountProduct(product) <= criticalAmount)
            notify(product);
    }

    @Override
    public Product getProduct(EnumProduct product) {
        Product newProduct = null;
        switch (product) {
            case SHAMPOO:
                newProduct = new IndustrialProduct();
                //...уменьшаем количество единиц продукта
                setAmount(product, amount--);
                break;
            case MILK:
                newProduct = new FoodProduct();
                //...уменьшаем количество единиц продукта
                setAmount(product, amount--);
                break;
        }
        return newProduct;
    }
}
