/*
 * Solutions for "sum3" problem.
 * Given an array of 3 integers, return the sum of all elements.
 */

public int sum3(int[] nums) {
    // Sum elements using a loop
    int sum = 0;
    for (Integer i : nums) {
        sum += i;
    }
    return sum;
}

public int sum3(int[] nums) {
    // Sum elements directly
    return nums[0] + nums[1] + nums[2];
}

public int sum3(int[] nums) {
    // Sum elements using Stream API
    return Arrays.stream(nums).sum();
}
