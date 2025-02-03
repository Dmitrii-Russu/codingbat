/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * 
 * @param str the input string
 * @return true if the string starts with "hi", false otherwise
 */

public boolean startHi(String str) {
  
  return str.startsWith("hi");
}

public boolean startHi(String str) {
  
  return str.length() >= 2 && str.substring(0, 2).equals("hi");
}
