package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public class Trombone extends Instrument implements Playable, Sellable {
    String trombType;

    protected Trombone(String family, String material, String colour, int buyPrice, int sellPrice, String trombType) {
        super(family, material, colour, buyPrice, sellPrice);
        this.trombType = trombType;
    }

    @Override
    public String sound() {
        return "baarp";
    }

    @Override
    public int calculateMarkup() {
        return this.sellPrice -= this.buyPrice;
    }
}


