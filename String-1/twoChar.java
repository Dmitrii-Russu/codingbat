/**
 * Given a string and an index, return a string length 2 starting at the given index.
 * If the index is too big or too small to define a string length 2, use the first 2 chars.
 * The string length will be at least 2.
 *
 * @param str the input string (length >= 2)
 * @param index the starting index
 * @return a substring of length 2 starting at index, or first 2 chars if index is invalid
 */

public String twoChar(String str, int index) {
  
  int index2 = 0;
  String[] result = new String[2];
  String[] chars = str.split("");
  if(index > chars.length-2 || index < 0) index = 0;
  for(int i = index; i < index + 2; i++)
  result[index2++] = chars[i];
  return String.join("", result);
  
}
