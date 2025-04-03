/**
 * The countEvens method returns the number of even integers in the given array.
 * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 *
 * @param nums the original array of integers.
 * @return the count of even numbers in the array.
 */

public int countEvens(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 0) {
            count++;
        }
    }
    return count;
}
