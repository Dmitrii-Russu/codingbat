/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars,
 * so "abc" and "cat" yields "abcat".
 *
 * @param a the first input string
 * @param b the second input string
 * @return the concatenated string, omitting one char if a double-char is created
 */

public String conCat(String a, String b) {
    if (a.isEmpty() || b.isEmpty()) return a + b;
    boolean isEqual = a.endsWith(b.substring(0, 1));
    return isEqual ? a + b.substring(1) : a + b;
}

public String conCat(String a, String b) {
  if(a.isEmpty() || b.isEmpty()) return a + b;
  boolean isEqual = b.charAt(0) == a.charAt(a.length()-1);
  return isEqual ? a.substring(0, a.length()-1) + b : a + b;
}
