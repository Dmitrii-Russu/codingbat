/**
 * Given a string, if the string "del" appears starting at index 1, 
 * return a string where that "del" has been deleted. 
 * Otherwise, return the string unchanged.
 * 
 * @param str the input string
 * @return the modified string with "del" removed if it appears at index 1
 */

public String delDel(String str) {
  
    if (str.length() == 0) return str;
    if (!str.substring(1).startsWith("del")) return str;
    return str.charAt(0) + str.substring(4);
}
