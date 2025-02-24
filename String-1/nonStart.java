/**
 * Given 2 strings, return their concatenation, except omit the first char of each.
 * The strings will be at least length 1.
 *
 * @param a the first string
 * @param b the second string
 * @return the concatenated string, excluding the first char of each
 */

public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
}
