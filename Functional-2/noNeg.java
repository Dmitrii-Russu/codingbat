/**
 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
 *
 * @param nums the input list of integers
 * @return the modified list with integers >= 0
 */

public List<Integer> noNeg(List<Integer> nums) {
    return nums.stream().filter(i -> i >= 0).toList();
}

public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf(i -> i < 0);
    return nums;
}
