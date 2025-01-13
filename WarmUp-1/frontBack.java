/**
 * Given a string, return a new string where the first and last characters
 * have been exchanged.
 *
 * @param str the input string
 * @return a new string with the first and last characters swapped
 */


public String frontBack(String str) {
    return str.length() >= 2
            ? str.charAt(str.length() - 1)
            + str.substring(1, str.length() - 1)
            + str.charAt(0)
            : str;
}
