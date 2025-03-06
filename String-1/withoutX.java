/**
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged.
 *
 * @param str the input string
 * @return the string without the first or last 'x' chars, if present
 */

public String withoutX(String str) {
    if (str.length() > 0 && str.charAt(0) == 'x') {
        str = str.substring(1);
    }
    if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
        str = str.substring(0, str.length() - 1);
    }
    return str;
}
