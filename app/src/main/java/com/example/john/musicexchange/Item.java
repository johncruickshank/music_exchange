package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public abstract class Item {
    String description;
    int buyPrice;
    int sellPrice;

    public Item(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
