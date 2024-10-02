/*
 * Solutions to the "arrayCount9" problem from CodingBat.
 * Given an array of ints, return the number of occurrences of the number 9 in the array.
 */

public int arrayCount9(int[] nums) {
    // Initialize a counter and use a for-each loop to count occurrences of 9 in the array.
    int count = 0;
    for (Integer i : nums) {
        if (i == 9) count++;
    }
    return count;
}


public int arrayCount9(int[] nums) {
    // Convert the array to a list and use Collections.frequency to count occurrences of 9.
    return Collections.frequency(Arrays.stream(nums).boxed().collect(Collectors.toList()), 9);
}


public int arrayCount9(int[] nums) {
    // Use Java Streams to filter the array and count occurrences of 9.
    return (int) Arrays.stream(nums).filter(i -> i == 9).count();
}
