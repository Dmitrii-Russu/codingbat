/**
 * The rotateLeft3 method rotates the elements of the given array of length 3 to the left.
 * The first element moves to the end, and the other elements shift left.
 * 
 * @param nums the input array of integers with a fixed length of 3.
 * @return the rotated array where elements are shifted left by one position.
 */

public int[] rotateLeft3(int[] nums) {
    int temp = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {
        nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = temp;
    return nums;
}
