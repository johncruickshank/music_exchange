package com.example.john.musicexchange;

import java.util.ArrayList;

/**
 * Created by John on 29/10/2017.
 */

public class Shop {

    private ArrayList<Sellable> stock;

    protected Shop() {
        this.stock = new ArrayList<>();
    }

    public void addSellable(Sellable sellable) {
        this.stock.add(sellable);
    }


    public int stockSize() {
        return stock.size();
    }

    public void removeSellable(Sellable sellable) {
        for (Sellable item : stock) {
            if (item.equals(sellable)) {
                this.stock.remove(item);
            }
        }
    }

    public int calculatePotentialProfit() {
        int total = 0;
        for (Sellable item : stock) {
            total +=item.calculateMarkup();
        }
        return total;
    }
}
