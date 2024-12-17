package com.netpace;

public class Milk implements Ingredient {
    public Milk() {
        System.out.println("Milk Poured");
    }

    @Override
    public void mix() {
        System.out.println("mixing milk");
    }
}
