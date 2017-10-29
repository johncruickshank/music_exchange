package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestTrombone {
    Trombone trombone;

    @Before
    public void setUp() throws Exception {
        trombone = new Trombone("brass", "brass", "gold", 150, 320, "tenor");
    }

    @Test
    public void canGetSound() throws Exception {
        assertEquals("baarp", trombone.sound());
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(170, trombone.calculateMarkup());
    }
}
