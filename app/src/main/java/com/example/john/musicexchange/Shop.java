package com.example.john.musicexchange;

import java.util.ArrayList;

/**
 * Created by John on 29/10/2017.
 */

public class Shop {
//    CD cd;
//    Drum drum;
//    Guitar guitar;
//    GuitarStrings guitarStrings;
//    Piano piano;
//    SheetMusic sheetMusic;
//    Trombone trombone;
    ArrayList<Sellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addSellable(Sellable sellable) {
        stock.add(sellable);
    }

    public void removeSellable(Sellable sellable) {
        for (Sellable item : stock) {
            if (item.equals(sellable)) {
                stock.remove(item);
            }
        }
    }


}
