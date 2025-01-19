/**
 * Given a list of integers, return a list where each integer is multiplied with itself.
 *
 * @param nums the input list of integers
 * @return the modified list containing the squares of each integer
 */

public List<Integer> square(List<Integer> nums) {
    nums.replaceAll(i -> i * i);
    return nums;
}

public List<Integer> square(List<Integer> nums) {
    return nums.stream().map(i -> i * i).toList();
}
