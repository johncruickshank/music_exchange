package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestGuitar {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("string", "mahogany", "brown", 100, 150, "acoustic", 6);
    }

    @Test
    public void canGetSound() throws Exception {
        assertEquals("twang", guitar.sound());
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(50, guitar.calculateMarkup());
    }
}
