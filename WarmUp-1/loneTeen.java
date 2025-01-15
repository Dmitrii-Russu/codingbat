/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 *
 * @param a the first integer
 * @param b the second integer
 * @return true if exactly one of the integers is teen, false otherwise
 */


public boolean loneTeen(int a, int b) {
    boolean isATeen = a >= 13 && a <= 19;
    boolean isBTeen = b >= 13 && b <= 19;
    return isATeen != isBTeen;
}