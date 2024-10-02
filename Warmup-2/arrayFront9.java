/*
 * Solutions to the "arrayFront9" problem from CodingBat.
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
 * The array length may be less than 4.
 */

public boolean arrayFront9(int[] nums) {
  
    int length = Math.min(nums.length, 4); // Effective length for checking
    for (int i = 0; i < length; i++) {
        if (nums[i] == 9) // Check for 9
            return true; // Return true if found
    }
    return false; // Return false if not found
}


public boolean arrayFront9(int[] nums) {
  
    return Arrays.stream(nums) // Convert to stream
                 .limit(4) // Limit to first 4 elements
                 .anyMatch(i -> i == 9); // Check for 9
}
