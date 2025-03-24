/**
 * Return the sum of two integers, but if either integer is a "teen" (in the range 13..19 inclusive),
 * return 19 instead of the sum.
 *
 * @param a the first integer
 * @param b the second integer
 * @return 19 if either is a teen, otherwise the sum of a and b
 */

public int teenSum(int a, int b) {
    boolean a19 = a >= 13 && a <= 19;
    boolean b19 = b >= 13 && b <= 19;
    return (a19 || b19) ? 19 : a + b;
}
