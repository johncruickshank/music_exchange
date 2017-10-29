package com.example.john.musicexchange;

import static android.R.attr.name;

/**
 * Created by John on 29/10/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {
    String type;
    int numStrings;

    public Guitar(String family, String material, String colour, int buyPrice, int sellPrice,  String type, int numStrings) {
        super(family, material, colour, buyPrice, sellPrice);
        this.type = type;
        this.numStrings = numStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String sound() {
        return "twang";
    }

}
