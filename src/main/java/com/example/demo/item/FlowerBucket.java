package com.example.demo.item;

import java.util.ArrayList;


public class FlowerBucket {

    private ArrayList<FlowerPack> flowerPack = new ArrayList<>();

    public void add(FlowerPack flower) {
        this.flowerPack.add(flower);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack i: flowerPack) {
            price += i.getPrice();
        }
        return price;
    }

 }
