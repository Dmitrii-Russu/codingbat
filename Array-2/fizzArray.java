/**
The fizzArray method creates and returns a new int array of length n containing
the numbers 0, 1, 2, ... n-1. If n is 0, returns an empty array.
@param n the length of the array to be created.
@return the created array containing sequence 0, 1, 2, ... n-1.
*/

public int[] fizzArray(int n) {
  int[] result = new int[n];
  for (int i = 0; i < n; i++) {
    result[i] = i;
  }
  return result;
}
