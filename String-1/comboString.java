/**
 * Given 2 strings, a and b, return a string of the form short+long+short, 
 * with the shorter string on the outside and the longer string on the inside. 
 * The strings will not be the same length, but they may be empty (length 0).
 *
 * @param a the first input string
 * @param b the second input string
 * @return the concatenated string in the form short+long+short
 */

public String comboString(String a, String b) {
    boolean isAShorter = a.length() < b.length();
    return isAShorter ? a + b + a : b + a + b;
}
