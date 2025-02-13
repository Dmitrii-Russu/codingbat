/**
 * Return true if the given string begins with "mix", except the 'm' can be anything, 
 * so "pix", "9ix" .. all count.
 *
 * @param str the input string
 * @return true if the string starts with any character followed by "ix", otherwise false
 */

public boolean mixStart(String str) {
  
  return str.length() > 0 ? str.substring(1).startsWith("ix") : false;
}
