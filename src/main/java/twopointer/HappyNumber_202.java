package twopointer;

import java.util.HashSet;
import java.util.Set;

/*
*202. Happy Number
Easy
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 010
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false


Constraints:

1 <= n <= 231 - 1
* */
class HappyNumber_202 {
    public static void main(String[] args) {


    }

    public boolean isHappyBySet(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }

            set.add(n);


            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return true;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
            if (fast == 1) return true;
            if (slow == fast) return false;
        }
    }

    int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
