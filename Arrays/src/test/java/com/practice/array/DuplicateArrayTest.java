package com.practice.array;


import org.junit.Assert;
import org.junit.Test;

public class DuplicateArrayTest {

    @Test
    public void testSingleElemArray(){
        int[] arr = {1};
        DuplicateArray duplicateArray = new DuplicateArray();
        int[] distinctElems = duplicateArray.removeDuplicates(arr);
        int[] expectedResult = {1};
        Assert.assertArrayEquals(expectedResult,distinctElems);
    }
}
