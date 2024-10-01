/*
 * Solutions to the "noTriples" problem from CodingBat.
 * Given an array of integers, return true if there are no triples
 * (i.e., three adjacent elements that are equal) in the array.
 */

public boolean noTriples(int[] nums) {
    // Check each index up to length - 2 to avoid index out of bounds
    for (int i = 0; i < nums.length - 2; i++) {
        // If three consecutive numbers are equal, return false
        if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
            return false;
        }
    }
    // If no triples were found, return true
    return true;
}

public boolean noTriples(int[] nums) {
    // Check for triples by comparing the first three elements in each sub-array of length 3
    for (int i = 0; i < nums.length - 2; i++) {
        // Create a sub-array and check if all three elements are equal
        if (Arrays.equals(Arrays.copyOfRange(nums, i, i + 3), new int[]{nums[i], nums[i], nums[i]})) {
            return false;
        }
    }
    return true;
}

public boolean noTriples(int[] nums) {
    // Use Java Streams to check for triples in a more functional style
    return java.util.stream.IntStream.range(0, nums.length - 2)
            .noneMatch(i -> nums[i] == nums[i + 1] && nums[i] == nums[i + 2]);
}

public boolean noTriples(int[] nums) {
    // Nested loop to check for equality of three adjacent elements
    for (int i = 0; i < nums.length - 2; i++) {
        boolean allEqual = true;
        for (int j = 1; j < 3; j++) {
            if (nums[i] != nums[i + j]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            return false; // Return false if three consecutive elements are equal
        }
    }
    return true; // Return true if no triples were found
}

