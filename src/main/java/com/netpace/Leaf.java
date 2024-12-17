package com.netpace;

public class Leaf implements Ingredient {
    public Leaf() {
        System.out.println("Tea leaves harvested");
    }

    @Override
    public void mix() {
        System.out.println("mixing tea leaves");
    }
}
