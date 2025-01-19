/**
 * Given a list of non-negative integers, return a list of the rightmost digits of each number.
 *
 * @param nums the input list of non-negative integers
 * @return the modified list containing the rightmost digits of each number
 */

public List<Integer> rightDigit(List<Integer> nums) {
    nums.replaceAll(i -> i % 10);
    return nums;
}

public List<Integer> rightDigit(List<Integer> nums) {
    return nums.stream().map(i -> i % 10).toList();
}
