package leetcodequest.array1;

/*
Q3. Max Consecutive Ones
Easy
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
* */
class MaxConsecutiveOnes_Q3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 1, 1, 1};
        int[] arr2 = {1, 0, 1, 1, 0, 1};

        System.out.println(findMaxConsecutiveOnes(arr1));
        System.out.println(findMaxConsecutiveOnes(arr2));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (final int num : nums) {
            if (num != 1) {
                count = 0;
            } else {
                count++;
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
