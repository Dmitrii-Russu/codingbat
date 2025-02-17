/**
 * Given an int n, return true if it is within 10 of 100 or 200.
 * 
 * Note: Math.abs(num) computes the absolute value of a number.
 * 
 * @param n the input integer
 * @return true if n is within 10 of 100 or 200, otherwise false
 */

public boolean nearHundred(int n) {
    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
}
