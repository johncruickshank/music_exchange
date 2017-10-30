package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public abstract class Item implements Sellable {
    String description;
    int buyPrice;
    int sellPrice;

    protected Item(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
