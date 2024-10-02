/*
 * Solutions to the "has271" problem from CodingBat.
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: 
 * a value, followed by the value plus 5, followed by the value minus 1. 
 * The "1" counts even if it differs by 2 or less from the correct value.
 */

public boolean has271(int[] nums) {
    // Loop through the array, stopping 2 elements before the end to prevent index out of bounds.
    for (int i = 0; i < nums.length - 2; i++) {
        int val = nums[i]; // Store the current value for reference.
        
        // Check for the pattern: current value (val), val + 5, and val - 1 (within a range of 2).
        if (nums[i + 1] == val + 5 && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
            return true; // Return true if the pattern is found.
        }
    }
    return false; // Return false if the pattern is not found.
}
