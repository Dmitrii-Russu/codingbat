/**
 * Given a string of even length, return a string made of the middle two chars.
 * For example, the string "string" yields "ri". The string length will be at least 2.
 *
 * @param str the input string of even length
 * @return a string consisting of the middle two characters of the input string
 */

public String middleTwo(String str) {
    int middle = str.length() / 2;
    return str.substring(middle - 1, middle + 1);
}

public String middleTwo(String str) {
  String result = "";
  int middle = str.length()/2;
  for(int i = middle-1; i < middle+1; i++)
  result = result + str.charAt(i);
  return result;
}
