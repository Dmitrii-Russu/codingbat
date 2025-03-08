/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string.
 * For example, the string "badxxx" or "xbadxx" yields true, while "xxbadxx" yields false.
 * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 *
 * @param str the input string
 * @return true if "bad" appears at index 0 or 1, false otherwise
 */

public boolean hasBad(String str) {
    if (str.length() < 3) return false;
    return str.startsWith("bad") || str.substring(1).startsWith("bad");
}
