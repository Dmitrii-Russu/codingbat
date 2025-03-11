/**
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string.
 * For example, the string "edited" yields true, while "edit" yields false.
 *
 * @param str the input string
 * @return true if the first 2 chars match the last 2 chars, false otherwise
 */

public boolean frontAgain(String str) {
    if (str.length() < 2) return false;
    String front = str.substring(0, 2);
    String back = str.substring(str.length() - 2);
    return front.equals(back);
}
