package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestShop {
    Shop shop;
    CD cd;
    Piano piano;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        cd = new CD("The Weeknd, Starboy", 5, 10);
        piano = new Piano("keyboard", "spruce", "black", 1500, 6300, "grand");
    }

    @Test
    public void canAddToStock() throws Exception {
        shop.addSellable(cd);
        assertEquals(1, shop.stock.size());
    }

    @Test
    public void canRemoveFromStock() throws Exception {
        shop.addSellable(cd);
        shop.addSellable(piano);
        shop.removeSellable(cd);
        assertEquals(1, shop.stock.size());
    }

    @Test
    public void canGetTotalPotentialProfit() throws Exception {
        shop.addSellable(cd);
        shop.addSellable(piano);
        assertEquals(4805, shop.calculatePotentialProfit());
    }
}
