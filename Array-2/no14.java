/**
 * The no14 method checks whether the given array contains no 1's or no 4's.
 * 
 * @param nums the original array of integers.
 * @return true if the array does not contain both 1 and 4, false otherwise.
 */

public boolean no14(int[] nums) {
    boolean has1 = false;
    boolean has4 = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            has1 = true;
        }
        if (nums[i] == 4) {
            has4 = true;
        }
        if (has1 && has4) {
            return false;
        }
    }
    return true;
}
