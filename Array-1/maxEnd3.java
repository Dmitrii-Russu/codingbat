/*
 * Given an array of ints length 3, determine the larger of the first or last element,
 * and set all elements in the array to that value. Return the modified array.
 */

public int[] maxEnd3(int[] nums) {
    int max = Math.max(nums[0], nums[nums.length - 1]); // Find the maximum of the first and last element
    for (int i = 0; i < nums.length; i++) // Iterate through the array
        nums[i] = max; // Set each element to the maximum value
    return nums; // Return the modified array
}

public int[] maxEnd3(int[] nums) {
    int max = Math.max(nums[0], nums[nums.length - 1]); // Find the maximum of the first and last element
    Arrays.fill(nums, max); // Fill the array with the maximum value
    return nums; // Return the modified array
}
