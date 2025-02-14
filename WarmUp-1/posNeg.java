/**
 * Given two integer values, return true if one is negative and one is positive.  
 * Except if the parameter "negative" is true, then return true only if both are negative.
 *
 * @param a the first integer
 * @param b the second integer
 * @param negative indicates whether both should be negative
 * @return true if the condition is met, false otherwise
 */

public boolean posNeg(int a, int b, boolean negative) {

  return negative ? (a < 0 && b < 0) : (a < 0 && b > 0) || (a > 0 && b < 0);
}

public boolean posNeg(int a, int b, boolean negative) {

    if (negative) {
        return a < 0 && b < 0;
    } else {
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
}
