package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public class SheetMusic extends Item implements Sellable {
    protected SheetMusic(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }
}
