package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public class Drum extends Instrument implements Playable, Sellable {
    String drumType;

    public Drum(String family, String material, String colour, int buyPrice, int sellPrice, String drumType){
        super(family, material, colour, buyPrice, sellPrice);
        this.drumType = drumType;
    }

    public String getDrumType() {
        return drumType;
    }

    public void setDrumType(String drumType) {
        this.drumType = drumType;
    }

    @Override
    public String sound() {
        return "boom";
    }

}
