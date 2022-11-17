package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumOfEvenTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyFlow(){
        int result = arrayOfInts.sumOfEven(new int[]{9,4,6,1,8,7,2,5,3});
        assertEquals(result, 20);
    }

    @Test
    void noEvenNumbersInArray(){
        int result = arrayOfInts.sumOfEven(new int[]{5,3});
        assertEquals(result, 0);
    }

    @Test
    void negativeNumbersInArray(){
        int result = arrayOfInts.sumOfEven(new int[]{5,3,-2,2,4,-4,6});
        assertEquals(result, 6);
    }

    @Test
    void sameNumbersInArray(){
        int result = arrayOfInts.sumOfEven(new int[]{1,2,2,3,5,6,7,8});
        assertEquals(result, 18);
    }
    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOfEven(null);
        assertEquals(0, result);
    }

}
