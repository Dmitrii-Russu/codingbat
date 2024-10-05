/**
 * The firstLast6 method checks if the number 6 is present as the first or last element
 * in the given integer array.
 *
 * @param nums the input array of integers (length 1 or more).
 * @return true if 6 appears as either the first or last element in the array; false otherwise.
 */

public boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length - 1] == 6; // Check if the first or last element is 6
}
