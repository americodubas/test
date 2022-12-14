package com.example;

/**
 * Hello ALIANZA!
 * Code for https://codingbat.com/prob/p159339
 */
public class App {

    public static int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        int[] others = new int[nums.length];
        int othersPosition = 0;

        // put 3s and 4s in the right position
        // store others to fill the blanks later
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                result[i] = 3;
                result[i + 1] = 4;
            } else if (nums[i] != 4) {
                // ignore number 4
                others[othersPosition++] = nums[i];
            }
        }

        // fill the blanks
        othersPosition = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = others[othersPosition++];
            }
        }
        return result;
    }
}
