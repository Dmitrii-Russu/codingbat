/**
 * Given a string, return a "rotated right 2" version where the last 2 chars 
 * are moved to the start. The string length will be at least 2.
 *
 * @param str the input string
 * @return the rotated string with the last 2 characters moved to the front
 */

public String right2(String str) {
    return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
}
