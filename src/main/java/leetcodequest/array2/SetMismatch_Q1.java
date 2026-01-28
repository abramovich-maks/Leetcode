package leetcodequest.array2;

import java.util.Arrays;
import java.util.HashSet;

/*
* Q1. Set Mismatch
Easy
You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104
* */
class SetMismatch_Q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4};
        int[] arr2 = {1, 1};

        System.out.println(Arrays.toString(findErrorNums(arr1)));
        System.out.println(Arrays.toString(findErrorNums(arr2)));
    }

    public static int[] findErrorNums(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        int dublicate = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!num.contains(nums[i])) {
                num.add(nums[i]);
            } else {
                dublicate = nums[i];
            }
        }
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (!num.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{dublicate, missing};
    }
}
