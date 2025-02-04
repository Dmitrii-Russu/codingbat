/**
 * Return true if the given string contains between 1 and 3 'e' (or 'E') chars.
 * 
 * @param str the input string
 * @return true if the number of 'e' or 'E' characters is between 1 and 3
 */

public boolean stringE(String str) {
    str = str.replaceAll("[^Ee]", "");
    return str.length() > 0 && str.length() <= 3;
}

public boolean stringE(String str) {
  
  int count = 0;
  for(int i = 0; i < str.length(); i++)
  if(str.charAt(i) == 'e') count++;
  return count <= 3 && count > 0;
}
