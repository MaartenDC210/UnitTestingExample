package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumOf3SmallestIntsTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyFlow(){
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{9,4,6,1,8,7,2,5,3});
        assertEquals(result, 6);
    }

    @Test
    void lessThen3NumbersInArray(){
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{5,3});
        assertEquals(result, 8);
    }

    @Test
    void sameNumbersInArray(){
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1,2,2,3,5,6,7,8});
        assertEquals(result, 5);
    }
    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOf3SmallestInts(null);
        assertEquals(0, result);
    }

}
