/**
 * Given three int values, a, b, c, return the largest of them.
 *
 * @param a the first integer
 * @param b the second integer
 * @param c the third integer
 * @return the largest of a, b, and c
 */


public int intMax(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
}

public int intMax(int a, int b, int c) {
    return (a > b)
            ? (a > c ? a : c)
            : (b > c ? b : c);
}
