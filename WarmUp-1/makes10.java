/**
 * Given two integer values, return true if either of them is 10,  
 * or if their sum equals 10.
 *
 * @param a the first integer
 * @param b the second integer
 * @return true if one of the values is 10 or their sum is 10, otherwise false
 */

public boolean makes10(int a, int b) {
    
  return a == 10 || b == 10 || a + b == 10;
}
