/**
 * Given two strings, a and b, return a new string made of the first char of a 
 * and the last char of b. If either string is length 0, use '@' for its missing char.
 *
 * @param a the first input string
 * @param b the second input string
 * @return a new string made of the first char of a and the last char of b
 */

public String lastChars(String a, String b) {
  if(a.equals("")) a = "@";
  if(b.equals("")) b = "@";
  return a.substring(0, 1) + b.substring(b.length()-1);
}

public String lastChars(String a, String b) {
    a = a.isEmpty() ? "@" : a.substring(0, 1);
    b = b.isEmpty() ? "@" : b.substring(b.length() - 1);
    return a + b;
}
