package ex03_more_arrays;
import ex01_arrays.ArrayOfInts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsFindCommonElements {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyFlow(){
        var result = arrayOfInts.findCommonElements(new int[]{1,2,3,4,5,6}, new int[]{4,5,6,7,8,9,10,11});
        assertArrayEquals(result, new int[]{4,5,6});
    }
}
