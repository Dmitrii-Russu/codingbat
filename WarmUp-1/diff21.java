/**
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 * 
 * @param n the input number
 * @return the absolute difference between n and 21, or double the difference if n > 21
 */
public int diff21(int n) {
    int result = Math.abs(21 - n);
    return n > 21 ? result * 2 : result;
}
