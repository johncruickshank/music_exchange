package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public abstract class Instrument {

    protected String family;
    protected String material;
    protected String colour;
    protected int buyPrice;
    protected int sellPrice;

    protected Instrument(String family, String material, String colour, int buyPrice, int sellPrice) {
        this.family = family;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public String getFamily() {
        return family;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
