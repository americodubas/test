package com.example;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldHave4After3Case1() {
        int[] sample = new int[] { 1, 3, 1, 4 };
        int[] answer = new int[] { 1, 3, 4, 1 };

        assertTrue(Arrays.equals(App.fix34(sample), answer));
    }

    @Test
    public void shouldHave4After3Case2() {
        int[] sample = new int[] { 1, 3, 1, 4, 4, 3, 1 };
        int[] answer = new int[] { 1, 3, 4, 1, 1, 3, 4 };

        assertTrue(Arrays.equals(App.fix34(sample), answer));
    }

    @Test
    public void shouldHave4After3Case3() {
        int[] sample = new int[] { 3, 2, 2, 4 };
        int[] answer = new int[] { 3, 4, 2, 2 };

        assertTrue(Arrays.equals(App.fix34(sample), answer));
    }
}
