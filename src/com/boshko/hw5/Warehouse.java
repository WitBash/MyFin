package com.boshko.hw5;

import java.util.ArrayList;
import java.util.List;

public abstract class Warehouse {
    //на складе происходит событие, а именно уменьшение некоторого продукта до значения при котором нужно пополнять запас
    private List<Observer> observers = new ArrayList<>();


    abstract Product getProduct(EnumProduct product);


    public void attach (Observer observer){
        observers.add(observer);
    }
    public void detach (Observer observer){
        observers.remove(observer);
    }

    protected void notify(EnumProduct product){
        for (Observer observer : observers){
            observer.update(this, product);
        }
    }

}
