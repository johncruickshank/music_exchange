package com.example.john.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 29/10/2017.
 */

public class TestSheetMusic {
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Sheet music for 'Starboy", 2, 20);
    }

    @Test
    public void canGetMarkup() throws Exception {
        assertEquals(18, sheetMusic.calculateMarkup());
    }
}
