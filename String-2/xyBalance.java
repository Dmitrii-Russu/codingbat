/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
 * but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given 
 * string is xy-balanced.
 *
 * @param str the input string
 * @return true if the string is xy-balanced, false otherwise
 */

public boolean xyBalance(String str) {
  
  boolean balanced = true;  
  String[] chars = str.split("");
  for (int i = 0; i < chars.length; i++) {
      if (chars[i].equals("x")) { balanced = false;}
      if (chars[i].equals("y")) { balanced = true;}
    }
    return balanced;
}
