/**
 * Given a string, return a new string where the last 3 chars are now in upper case.
 * If the string has less than 3 chars, uppercase whatever is there.
 * 
 * @param str the input string
 * @return the string with the last 3 characters in uppercase
 */


public String endUp(String str) {
    if (str.length() <= 3) { return str.toUpperCase();}
    return str.substring(0, str.length() - 3) 
              + str.substring(str.length() - 3).toUpperCase();
}
