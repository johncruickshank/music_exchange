package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public abstract class Instrument {

    String family;
    String material;
    String colour;
    int buyPrice;
    int sellPrice;

    public Instrument(String family, String material, String colour, int buyPrice, int sellPrice) {
        this.family = family;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
