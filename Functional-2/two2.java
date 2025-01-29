/**
 * Given a list of non-negative integers, return a list of those numbers multiplied by 2,
 * omitting any of the resulting numbers that end in 2.
 *
 * @param nums the input list of non-negative integers
 * @return the modified list with numbers multiplied by 2 and not ending in 2
 */

public List<Integer> two2(List<Integer> nums) {
    return nums.stream().map(i -> i * 2).filter(i -> i % 10 != 2).toList();
}

public List<Integer> two2InPlace(List<Integer> nums) {
    nums.replaceAll(i -> i * 2);
    nums.removeIf(i -> i % 10 == 2);
    return nums;
}
