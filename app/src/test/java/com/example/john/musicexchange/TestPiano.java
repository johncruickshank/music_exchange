package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestPiano {
    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("keyboard", "spruce", "black", 1500, 6300, "grand");
    }

    @Test
    public void canGetSound() throws Exception {
        assertEquals("ding", piano.sound());
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(4800, piano.calculateMarkup());
    }
}
