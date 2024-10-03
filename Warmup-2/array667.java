/*
 * Solutions to the "array667" problem.
 * Given an array of ints, return the number of times that two 6's are next to each other,
 * or the number of times a 6 is followed by a 7.
 */

public int array667(int[] nums) {
    
    // Solution 1: Iterate through the array, checking pairs of adjacent numbers.
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
        // Check if the current number is 6, followed by either 6 or 7
        if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
            count++;  // Increment the count for each valid pair
        }
    }
    return count;  // Return the total count of valid pairs
}


public int array667(int[] nums) {
    
    // Solution 2: Use subarray comparison to check for the sequences {6, 6} and {6, 7}
    int count = 0;
    int[] a = {6, 6};
    int[] b = {6, 7};
    
    // Iterate through the array, checking for matches with either subarray
    for (int i = 0; i <= nums.length - a.length; i++) {
        if (Arrays.equals(Arrays.copyOfRange(nums, i, i + a.length), a) ||
            Arrays.equals(Arrays.copyOfRange(nums, i, i + b.length), b)) {
            count++;  // Increment the count for each match
        }
    }
    return count;  // Return the total count of valid pairs
}


public int array667(int[] nums) {
    
    // Solution 3: Use Java streams to filter and count the valid pairs {6, 6} or {6, 7}
    return (int) java.util.stream.IntStream.range(0, nums.length - 1)
        .filter(i -> nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))  // Check adjacent pairs
        .count();  // Return the count as an integer
}
