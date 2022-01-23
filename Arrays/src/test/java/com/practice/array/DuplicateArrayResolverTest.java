package com.practice.array;


import org.junit.Assert;
import org.junit.Test;

public class DuplicateArrayResolverTest {

    @Test
    public void testSingleElemArray() {
        int[] arr = {1};
        DuplicateArrayResolver duplicateArray = new DuplicateArrayResolver();
        int[] distinctElems = duplicateArray.removeDuplicates(arr);
        int[] expectedResult = {1};
        Assert.assertArrayEquals(expectedResult, distinctElems);
    }

    @Test
    public void testArrayWithDistinctElems() {
        int arr[] = {1, 2, 3, 4, 9, 7};
        DuplicateArrayResolver duplicateArrayResolver = new DuplicateArrayResolver();
        int[] result = duplicateArrayResolver.removeDuplicates(arr);
        int[] expectedResult = {1, 2, 3, 4, 9, 7};
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testArrayWithDuplicateElems() {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 4, 4, 9, 7};
        DuplicateArrayResolver duplicateArrayResolver = new DuplicateArrayResolver();
        int[] result = duplicateArrayResolver.removeDuplicates(arr);
        int[] expectedResult = {1, 2, 3, 4, 9, 7, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testArrayWithDuplicateElemsWithRepeatingSegments() {
        int arr[] = {1, 1, 2, 1, 1, 4, 4, 4, 9, 9, 7};
        DuplicateArrayResolver duplicateArrayResolver = new DuplicateArrayResolver();
        int[] result = duplicateArrayResolver.removeDuplicates(arr);
        int[] expectedResult = {1, 2, 1, 4, 9, 7, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expectedResult, result);
    }
}
