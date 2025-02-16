/**
 * Given a string, take the last character and return a new string 
 * with the last character added at the front and back.
 * For example, "cat" yields "tcatt".
 * The original string will be length 1 or more.
 *
 * @param str the input string
 * @return a new string with the last character added at both ends
 */

public String backAround(String str) {
  
    String result = str.charAt(str.length() - 1) + "";

    return result + str + result;
}
