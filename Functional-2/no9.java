/**
 * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
 *
 * @param nums the input list of non-negative integers
 * @return the modified list with numbers not ending in 9
 */

public List<Integer> no9(List<Integer> nums) {
    return nums.stream().filter(i -> i % 10 != 9).toList();
}

public List<Integer> no9InPlace(List<Integer> nums) {
    nums.removeIf(i -> i % 10 == 9);
    return nums;
}