/**
 * Given a string, return true if it ends in "ly".
 * For example, the string "happily" yields true, while "happy" yields false.
 *
 * @param str the input string
 * @return true if the string ends with "ly", false otherwise
 */

public boolean endsLy(String str) { return str.endsWith("ly");}

public boolean endsLy(String str) {
  return str.length() > 1 ? str.substring(str.length()-2).equals("ly") : false;
}

public boolean endsLy(String str) {
  return str.length() > 1 
            ? str.charAt(str.length()-1) == 'y' 
                && str.charAt(str.length()-2) == 'l' : false;
}

public boolean endsLy(String str) {
  return str.length() > 1 ? str.substring(str.length()-2).matches("ly") : false;
}

public boolean endsLy(String str) {
  return str.length() > 1 ? str.substring(str.length()-2).contains("ly") : false;
}
