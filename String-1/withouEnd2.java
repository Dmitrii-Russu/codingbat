/**
 * Given a string, return a version without both the first and last char of the string.
 * The string may be any length, including 0.
 *
 * @param str the input string
 * @return a string without the first and last character, or an empty string if the length is less than 2
 */

public String withouEnd2(String str) {
  if (str.length() < 2)  return "";
  else return str.substring(1, str.length() - 1);
  }
  
public String withouEnd2(String str) {  
  return str.length() < 2 ? "" : str.substring(1, str.length() - 1);
}
