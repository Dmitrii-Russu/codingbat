/**
 * Given a string, return a new string made of 3 copies of the last 2 chars 
 * of the original string. The string length will be at least 2.
 *
 * @param str the input string
 * @return a new string consisting of 3 copies of the last 2 characters
 */

public String extraEnd(String str) {
    return str.substring(str.length() - 2).repeat(3);
}

public String extraEnd(String str) {
    String result = str.substring(str.length() - 2);
    return result + result + result;
}

public String extraEnd(String str) {
    String result = "" + str.charAt(str.length() - 2) + str.charAt(str.length() - 1);
    return result + result + result;
}

public String extraEnd(String str) {
    String result = "";
    for (int i = 0; i < 3; i++) {
        result = result + str.substring(str.length() - 2);
    }
    return result;
}
