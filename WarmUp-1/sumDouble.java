/**
 * Given two int values, return their sum. Unless the two values are the same,
 * then return double their sum.
 *
 * @param a the first integer
 * @param b the second integer
 * @return the sum of the two integers, or double their sum if they are the same
 */
public int sumDouble(int a, int b) {
    return a == b ? (a + b) * 2 : a + b;
}
