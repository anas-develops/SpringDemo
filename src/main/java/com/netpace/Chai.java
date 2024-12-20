package com.netpace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
@Scope("prototype")
public class Chai {

    Ingredient ingredient;
    @Value("10")
    private int sips;

    @Value("doodh patti")
    private String flavor;

    public Chai(){}

    public Chai(int sips, Ingredient ingredient, String flavor) {
        this.sips = sips;
        this.ingredient = ingredient;
        this.flavor = flavor;
        System.out.println("------Chai made------");
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    @Autowired
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSips() {
        return sips;
    }

    public void setSips(int sips) {
        this.sips = sips;
    }

    public void mix() {
        this.ingredient.mix();
    }

    public void drink() {
        sips++;
        this.mix();
        System.out.println("Drink Chai, "+sips+" sips, of "+flavor+" flavor");
    }
}
