package com.netpace;

import org.springframework.stereotype.Component;

@Component("leaf")
public class Leaf implements Ingredient {
    public Leaf() {
        System.out.println("Tea leaves harvested");
    }

    @Override
    public void mix() {
        System.out.println("mixing tea leaves");
    }
}
