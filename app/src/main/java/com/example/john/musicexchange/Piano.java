package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public class Piano extends Instrument implements Playable, Sellable {
    String type;

    public Piano(String family, String material, String colour, int buyPrice, int sellPrice, String type) {
        super(family, material, colour, buyPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String sound() {
        return "ding";
    }
}
