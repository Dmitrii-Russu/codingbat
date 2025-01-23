/**
 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
 *
 * @param nums the input list of integers
 * @return the modified list with each integer processed as (i + 1) * 10
 */

public List<Integer> math1(List<Integer> nums) {
    nums.replaceAll(i -> (i + 1) * 10);
    return nums;
}

public List<Integer> math1(List<Integer> nums) {
    return nums.stream().map(i -> (i + 1) * 10).toList();
}
