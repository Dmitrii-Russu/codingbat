/**
 * Given a list of integers, return a list where each integer is multiplied by 2.
 *
 * @param nums the input list of integers
 * @return the modified list where each integer is multiplied by 2
 */

public List<Integer> doubling(List<Integer> nums) {
    return nums.stream().map(i -> i * 2).toList();
}

public List<Integer> doubling(List<Integer> nums) {
    nums.replaceAll(i -> i * 2);
    return nums;
}
