/**
 * Given a string, return a version without the first and last char.
 * For example, the string "Hello" yields "ell". The string length will be at least 2.
 *
 * @param str the input string
 * @return a string without the first and last character
 */

public String withoutEnd(String str) { return str.substring(1, str.length()-1);}

public String withoutEnd(String str) {
  String result = "";
  for(int i = 1; i < str.length()-1; i++)
    result = result + str.charAt(i);
  return result;
}
