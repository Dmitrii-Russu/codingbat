public int[] pre4(int[] nums) {
  
  int[] result = new int[0];
  for(int i = nums.length-1; i >= 0; i--) {
  if(nums[i] == 4) result = new int[i];
  else if(result.length > 0) result[i] = nums[i];
  }
  return result;
}
