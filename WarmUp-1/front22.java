/**
 * Given a string, take the first 2 characters and return the string with the 2 characters
 * added at both the front and back. For example, "kitten" yields "kikittenki".
 * If the string length is less than 2, use whatever characters are there.
 *
 * @param str the input string
 * @return the modified string with the first 2 characters added at the front and back
 */


public String front22(String str) {
    if (str.length() < 2) {
        return str + str + str;
    } else {
        String firstTwoChars = str.substring(0, 2);
        return firstTwoChars + str + firstTwoChars;
    }
}
