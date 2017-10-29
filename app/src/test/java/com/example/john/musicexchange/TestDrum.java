package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestDrum {
    Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum("percussion", "wood", "red", 75, 125, "snare");
    }

    @Test
    public void canGetSound() throws Exception {
        assertEquals("boom", drum.sound());
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(50, drum.calculateMarkup());
    }
}
