package ex03_more_arrays;
import ex01_arrays.ArrayOfInts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArrayOfIntsFindCommonElements {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyFlow(){
        var result = arrayOfInts.findCommonElements(new Integer[]{1,2,3,4,5,6}, new Integer[]{4,5,6,7,8,9,10,11});
        assertArrayEquals(result, new Integer[]{4,5,6});
    }

    @Test
    void hasDoubleIntegersInTheSameArray(){
        var result = arrayOfInts.findCommonElements(new Integer[]{1,2,3,4,5,6}, new Integer[]{4,4,4,5,5,6,10,3});
        assertArrayEquals(result, new Integer[]{3,4,5,6});
    }

    @Test
    void oneArrayIsEmpty(){
        var result = arrayOfInts.findCommonElements(new Integer[]{1,2,3,4,5,6}, new Integer[]{});
        assertArrayEquals(result, new Integer[]{});
    }

    @Test
    void oneArrayIsNull(){
        var result = arrayOfInts.findCommonElements(new Integer[]{1,2,3,4,5,6}, null);
        assertArrayEquals(result, new Integer[]{});
    }

    @Test
    void BothArraysAreNull(){
        var result = arrayOfInts.findCommonElements(null, null);
        assertArrayEquals(result, new Integer[]{});
    }

    @Test
    void BothArraysAreEmpty(){
        var result = arrayOfInts.findCommonElements(new Integer[]{}, new Integer[]{});
        assertArrayEquals(result, new Integer[]{});
    }


}
