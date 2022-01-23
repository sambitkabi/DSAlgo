package com.practice.array;

public class DuplicateArrayResolver {
    public int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[k++] = arr[i];
            }
        }
        return result;
    }
}
