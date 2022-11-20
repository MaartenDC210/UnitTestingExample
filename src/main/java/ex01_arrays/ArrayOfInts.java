package ex01_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ArrayOfInts {
    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts,arrayOfInts.length);
        Arrays.sort(copy);
        int from = x > copy.length ? 0 : copy.length - x;

        int[] reverse = Arrays.copyOfRange(copy, from, copy.length);
        System.out.println(from);
        System.out.println(copy.length);
        System.out.println(Arrays.toString(reverse));
       return sumOfInts(reverse);
    }

    public int countMostPopularNumber(int[] arrayOfInts){
        if (arrayOfInts == null) return 0;
        if (arrayOfInts.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arrayOfInts) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i,1);
        }
        Integer[] numbers;
        numbers = map.values().toArray(new Integer[0]);
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public Integer[] findCommonElements(int[] array1, int[] array2 ){
        var commonElements = new HashMap<Integer, Integer>();
        var index = 0;
        if( array1 == null || array2 == null) return new Integer[]{};
        for( int i : array1){
            for (int j : array2) {
                if(!commonElements.containsValue(j) && i == j)
                    commonElements.put(index, j);
            }
            index++;
        }

        return commonElements.values().toArray(new Integer[0]);
    }

    public Integer[] findDuplicateValues(int[] array){
        var NotDuplicateElements = new HashMap<Integer, Integer>();
        var index = 0;
        var duplicateElements = new HashMap<Integer, Integer>();
        if( array == null) return new Integer[]{};
        if( array.length == 0 ) return new Integer[]{};
        for( int i : array) {
            if (!NotDuplicateElements.containsValue(i))
                NotDuplicateElements.put(index, i);
            else
                duplicateElements.put(index, i);

            index++;
        }
        return duplicateElements.values().toArray(new Integer[0]);
    }


    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
