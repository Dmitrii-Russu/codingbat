/**
 * Given a non-empty string and an int n, return a new string where the char 
 * at index n has been removed. The value of n will be a valid index of a char 
 * in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 * 
 * @param str the input string
 * @param n the index of the character to remove
 * @return the string with the character at index n removed
 */

private String removeCharAt(String str, int n) {
    return str.substring(0, n) + str.substring(n + 1);
}

public String missingChar(String str, int n) {
  String result = "";
  for(int i = 0; i < str.length(); i++) {
  if(i == n) continue;
  result = result + str.charAt(i);}
  return result;
}
