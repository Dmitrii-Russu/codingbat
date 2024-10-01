/*
 * Solutions to the "array123" problem from CodingBat.
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 */


public boolean array123(int[] nums) {
  
  for(int i = 0; i < nums.length-2; i++)
  if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
  return true;
  return false;
}


public boolean array123(int[] nums) {
  
  int[] sequence = {1, 2, 3};
  for(int i = 0; i <= nums.length - sequence.length; i++)
  if(Arrays.equals(Arrays.copyOfRange(nums, i, i + sequence.length), sequence)) 
  return true;
  return false;
}


public boolean array123(int[] nums) {

  List<Integer> sequence = Arrays.asList(1, 2, 3);
  List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
  return Collections.indexOfSubList(numsList, sequence) != -1;
}


public boolean array123(int[] nums) {

  StringBuilder sb = new StringBuilder();
  for(Integer i : nums)
  sb.append(i);
  return sb.toString().contains("123");
}


public boolean array123(int[] nums) {

  return Arrays.toString(nums).replaceAll("[\\[\\], ]", "").contains("123");
}


public boolean array123(int[] nums) {

  return Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining()).contains("123");
}
