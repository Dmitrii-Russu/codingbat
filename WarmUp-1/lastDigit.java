/**
 * Given two non-negative int values, return true if they have the same last digit.
 * For example, 27 and 57 have the same last digit.
 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 *
 * @param a the first non-negative integer
 * @param b the second non-negative integer
 * @return true if both integers have the same last digit, false otherwise
 */


public boolean lastDigit(int a, int b) {
    return a % 10 == b % 10;
}

