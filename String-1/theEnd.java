/**
 * Given a string, return a string length 1 from its front, unless front is false, 
 * in which case return a string length 1 from its back. The string will be non-empty.
 *
 * @param str   the input string
 * @param front a boolean indicating whether to take the first or last character
 * @return a string of length 1 from the front or back
 */

public String theEnd(String str, boolean front) {
  
    return front ? str.substring(0, 1) : str.substring(str.length() - 1);
}

public String theEnd(String str, boolean front) {
  
    return front ? str.charAt(0) + "" : str.charAt(str.length()-1) + "";
}
