/**
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged.
 * 
 * @param str the input string
 * @return the original string if it starts with "not", otherwise a new string with "not " prepended
 */

public String notString(String str) {
    return str.startsWith("not") ? str : "not " + str;
}
