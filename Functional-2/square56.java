/**
 * Given a list of integers, return a list of those numbers squared and the product added to 10, 
 * omitting any of the resulting numbers that end in 5 or 6.
 *
 * @param nums the input list of integers
 * @return the modified list
 */

public List<Integer> square56(List<Integer> nums) {
    return nums.stream().map(i -> i * i + 10).filter(i -> i % 10 != 5 && i % 10 != 6).toList();
}

public List<Integer> square56(List<Integer> nums) {
    nums.replaceAll(i -> i * i + 10);
    nums.removeIf(i -> i % 10 == 5 || i % 10 == 6);
    return nums;
}
