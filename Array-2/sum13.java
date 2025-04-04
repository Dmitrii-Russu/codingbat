/**
 * The sum13 method returns the sum of numbers in the array, where the number 13
 * is very unlucky, so it does not count and numbers that come immediately after
 * a 13 also do not count. Returns 0 for an empty array.
 * 
 * @param nums the original array of integers.
 * @return the sum of numbers excluding 13 and numbers after 13.
 */

public int sum13(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 13) {
            i++; // Skip the next number after 13
        } else {
            sum += nums[i];
        }
    }
    return sum;
}
