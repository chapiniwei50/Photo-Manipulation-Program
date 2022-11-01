package org.cis120;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 *
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     *
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    /* ADD YOUR OWN TESTS BELOW */
    @Test
    public void testConstructArrayLessThannone() {
        int[] arr = {};
        Pixel p = new Pixel(arr);
        assertEquals(0, p.getRed());
        assertEquals(0, p.getGreen());
        assertEquals(0, p.getBlue());
    }
    @Test
    public void testConstructArrayLessThanone() {
        int[] arr = {40};
        Pixel p = new Pixel(arr);
        assertEquals(40, p.getRed());
        assertEquals(0, p.getGreen());
        assertEquals(0, p.getBlue());
    }
    @Test
    public void testConstructArrayLessThan3two() {
        int[] arr = {40,30};
        Pixel p = new Pixel(arr);
        assertEquals(40, p.getRed());
        assertEquals(30, p.getGreen());
        assertEquals(0, p.getBlue());
    }
    @Test
    public void testConstructArrayOutOfBoundupper() {
        int[] arr = {300,30,10};
        Pixel p = new Pixel(arr);
        assertEquals(255, p.getRed());
        assertEquals(30, p.getGreen());
        assertEquals(10, p.getBlue());
    }
    @Test
    public void testConstructArrayOutOfBoundlower() {
        int[] arr = {-3,30,10};
        Pixel p = new Pixel(arr);
        assertEquals(0, p.getRed());
        assertEquals(30, p.getGreen());
        assertEquals(10, p.getBlue());
    }
    @Test
    public void testConstructOufOfBoundupper() {
        Pixel p = new Pixel(300, 50, 60);
        assertEquals(255, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }
    @Test
    public void testConstructOufOfBoundlower() {
        Pixel p = new Pixel(-3, 50, 60);
        assertEquals(0, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }
    @Test
    public void testGetComponents() {
        Pixel p = new Pixel(40, 50, 60);
        int[] arr = {40,50,60};
        assertArrayEquals(arr, p.getComponents());

    }
    @Test
    public void testDistance() {
        Pixel p = new Pixel(40, 50, 60);
        Pixel pix = new Pixel(20, 70, 30);
        assertEquals(p.distance(pix), 70);

    }
    @Test
    public void testDistanceNull() {
        Pixel p = new Pixel(40, 50, 60);
        Pixel pix = null;
        assertEquals(p.distance(pix), -1);

    }
    @Test
    public void testToString() {
        Pixel p = new Pixel(40, 50, 60);
        String s = "(" + 40 + ", " + 50 + ", " + 60 + ")";
        assertEquals(p.toString(), s);

    }
    @Test
    public void testEqualsTrue() {
        Pixel p = new Pixel(40, 50, 60);
        Pixel px = new Pixel(40, 50, 60);
        assertEquals(p.equals(px), true);

    }
    @Test
    public void testEqualsFalse() {
        Pixel p = new Pixel(30, 50, 60);
        Pixel px = new Pixel(40, 50, 60);
        assertEquals(p.equals(px), false);

    }


}
