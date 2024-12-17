package com.netpace;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Milk implements Ingredient {
    public Milk() {
        System.out.println("Milk Poured");
    }

    @Override
    public void mix() {
        System.out.println("mixing milk");
    }
}
