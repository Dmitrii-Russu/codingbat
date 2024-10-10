/**
 * Given an array of ints length 3, return a new array with the elements in reverse order.
 * For example, {1, 2, 3} becomes {3, 2, 1}.
 */

public int[] reverse3(int[] nums) {
    int index = 0;
    int[] reversed = new int[3]; // Create a new array to store the reversed elements
    for (int i = nums.length - 1; i >= 0; i--) { // Iterate through the array backwards
        reversed[index] = nums[i]; // Set the current element to the new array
        index++; // Move to the next index
    }
    return reversed; // Return the new reversed array
}


public int[] reverse3(int[] nums) {
    List<Integer> reversedList = Arrays.stream(nums).boxed().collect(Collectors.toList()); // Convert array to a list
    Collections.reverse(reversedList); // Reverse the list
    return reversedList.stream().mapToInt(Integer::intValue).toArray(); // Convert list back to array and return
}
