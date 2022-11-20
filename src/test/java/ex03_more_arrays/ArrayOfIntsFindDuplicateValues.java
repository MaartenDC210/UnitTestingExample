package ex03_more_arrays;
import ex01_arrays.ArrayOfInts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsFindDuplicateValues {
    private final ArrayOfInts arrayOfInts = new ArrayOfInts();
    @Test
    void happyFlow(){
        var result = arrayOfInts.findDuplicateValues(new int[]{1,2,2,3,4,5,6});
        assertArrayEquals(result, new Integer[]{2});
    }

    @Test
    void multipleDuplicateValues(){
        var result = arrayOfInts.findDuplicateValues(new int[]{1,2,2,3,4,5,5,6});
        assertArrayEquals(result, new Integer[]{2,5});
    }

    @Test
    void noDuplicateValues(){
        var result = arrayOfInts.findDuplicateValues(new int[]{1,2,3,4,5,6});
        assertArrayEquals(result, new Integer[]{});
    }

    @Test
    void emptyArray() {
        var result = arrayOfInts.findDuplicateValues(new int[]{});
        assertArrayEquals(new Integer[]{}, result );
    }

    @Test
    void nullArray() {
        var result = arrayOfInts.findDuplicateValues(null);
        assertArrayEquals(result, new Integer[]{});
    }


}
