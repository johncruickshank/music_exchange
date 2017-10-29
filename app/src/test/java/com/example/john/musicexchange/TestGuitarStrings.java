package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestGuitarStrings {
    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new GuitarStrings("Guitar strings, pack of 3", 1, 15);
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(14, guitarStrings.calculateMarkup());
    }
}
