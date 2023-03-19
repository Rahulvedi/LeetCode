package org.example.arrays.medium;

import org.example.arrays.ArrayUtils;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
//        https://leetcode.com/problems/product-of-array-except-self/
        int[] arr = new int[]{-1, 1, 0, -3, 3};
        ArrayUtils.display(productExceptSelf(arr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] returnlist = new int[nums.length];
        int zeroesCount = 0;
        int product = 1;
        for (int num : nums) {
            if (num != 0) product = product * num;
            else zeroesCount++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroesCount > 1) returnlist[i] = 0;
                else returnlist[i] = product;
            } else {
                if (zeroesCount > 0) returnlist[i] = 0;
                else returnlist[i] = product / nums[i];
            }
        }
        return returnlist;
    }
}
