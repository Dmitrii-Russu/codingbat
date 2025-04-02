/**
 * The post4 method returns a new array containing the elements from the original array
 * that come after the last occurrence of 4 in the original array.
 * The original array will contain at least one 4.
 * It is valid in Java to create an array of length 0.
 *
 * @param nums the original array of integers.
 * @return a new array containing elements after the last occurrence of 4.
 */

public int[] post4(int[] nums) {
    int index = 0;
    int[] result = new int[0];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) { 
            result = new int[nums.length - i - 1];
            index = 0;
        }
        else if (result.length > 0) {
            result[index++] = nums[i];
        }
    }
    return result;
}
