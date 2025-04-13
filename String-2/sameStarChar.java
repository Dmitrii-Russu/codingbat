/**
 * Return true if for every '*' (star) in the string, if there are chars both 
 * immediately before and after the star, they are the same.
 *
 * @param str the input string
 * @return true if all stars have matching surrounding chars, false otherwise
 */

public boolean sameStarChar(String str) {
    String[] chars = str.split("");
    for (int i = 1; i < chars.length-1; i++) {
        if (chars[i].equals("*")) {
            if (!chars[i - 1].equals(chars[i + 1])) {
                return false;
            }
        }
    }
    return true;
}

public boolean sameStarChar(String str) {
  for(int i = 0; i < chars.length; i++) {
    if(
      chars[i].equals("*")
      && (i > 0 && i < chars.length-1)
      && !chars[i-1].equals(chars[i+1])
      ) 
      return false;
  }
  return true;}
