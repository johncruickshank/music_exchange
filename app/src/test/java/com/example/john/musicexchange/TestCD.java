package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestCD {
    CD cd;

    @Before
    public void setUp() throws Exception {
        cd = new CD("The Weeknd, Starboy", 5, 10);
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(5, cd.calculateMarkup());
    }
}
