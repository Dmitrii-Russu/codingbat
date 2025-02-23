/**
 * Given a string of even length, return the first half.
 * For example, the string "WooHoo" yields "Woo".
 *
 * @param str the input string
 * @return the first half of the input string
 */

public String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
}
