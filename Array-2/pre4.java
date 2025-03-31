/**
 * The pre4 method returns a new array containing the elements from the original array 
 * that come before the first occurrence of 4 in the original array.
 * The original array will contain at least one 4.
 * It is valid in Java to create an array of length 0.
 *
 * @param nums the original array of integers.
 * @return a new array containing elements before the first occurrence of 4.
 */

public int[] pre4(int[] nums) {
    int[] result = new int[0]; // Initialize result as an empty array
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] == 4) {
            result = new int[i]; // Create a new array of length i when 4 is found
        } else if (result.length > 0) {
            result[i] = nums[i]; // Copy elements into the new array
        }
    }
    return result;
}
