package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public class CD extends Item implements Sellable {

    protected CD(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }
}
