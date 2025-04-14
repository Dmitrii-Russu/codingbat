/**
 * The modThree method checks if the array contains either 3 even or 3 odd values all next to each other.
 *
 * @param nums the original array of integers.
 * @return true if there are 3 consecutive even/odd numbers, false otherwise.
 */

public boolean modThree(int[] nums) {
    for (int i = 0; i <= nums.length - 3; i++) {
        boolean allEven = (nums[i] % 2 == 0) && (nums[i+1] % 2 == 0) && (nums[i+2] % 2 == 0);
        boolean allOdd = (nums[i] % 2 != 0) && (nums[i+1] % 2 != 0) && (nums[i+2] % 2 != 0);
        if (allEven || allOdd) {
            return true;
        }
    }
    return false;
}
