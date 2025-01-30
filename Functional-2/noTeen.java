/**
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
 *
 * @param nums the input list of integers
 * @return the modified list with numbers not between 13 and 19 inclusive
 */

public List<Integer> noTeen(List<Integer> nums) {
    return nums.stream().filter(i -> !(i < 13 || i > 19)).toList();
}

public List<Integer> noTeenInPlace(List<Integer> nums) {
    nums.removeIf(i -> (i >= 13 && i <= 19));
    return nums;
}
