/**
 * Given two int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 *
 * @param a the first integer
 * @param b the second integer
 * @return true if both are in the same specified range, false otherwise
 */

public boolean in3050(int a, int b) {
  
    return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) 
        || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
}
