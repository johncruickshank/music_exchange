package com.example.john.musicexchange;

import static android.R.attr.name;

/**
 * Created by John on 29/10/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {
    String type;
    int numStrings;

    protected Guitar(String family, String material, String colour, int buyPrice, int sellPrice,  String type, int numStrings) {
        super(family, material, colour, buyPrice, sellPrice);
        this.type = type;
        this.numStrings = numStrings;
    }

    public String sound() {
        return "twang";
    }

}
