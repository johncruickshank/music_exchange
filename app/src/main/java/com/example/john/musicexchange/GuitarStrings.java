package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public class GuitarStrings extends Item implements Sellable {
    public GuitarStrings(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }
}
