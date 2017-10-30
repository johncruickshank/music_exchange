package com.example.john.musicexchange;

/**
 * Created by John on 29/10/2017.
 */

public interface Sellable {
    int calculateMarkup();
//    could use the below instead of having them enforced in the Item abstract class.  Adds flexibility.
//    int getBuyPrice();
//    int getSellPrice();
}
