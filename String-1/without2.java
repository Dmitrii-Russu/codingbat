/**
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
 * The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 *
 * @param str the input string
 * @return the modified string if the condition is met, otherwise the original string
 */

public String without2(String str) {
    if (str.length() < 2) return str;
    String first = str.substring(0, 2);
    String second = str.substring(str.length() - 2);
    return first.equals(second) ? str.substring(2) : str;
}
