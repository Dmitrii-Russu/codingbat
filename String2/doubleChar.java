/**
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 * @param str the input string
 * @return a new string where each character from the original string is duplicated
 */

public String doubleChar(String str) {
   
    return Arrays.stream(str.split("")) 
            .map(s -> s + s) 
            .collect(Collectors.joining()); 
}

public String doubleChar(String str) {
  
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        result = result + str.charAt(i) + str.charAt(i);
    }
    return result;
}
  
public String doubleChar(String str) {    
  
  String result = "";
  for (int i = 0; i < str.length(); i++) {
      result = result + str.substring(i, i + 1) + str.substring(i, i + 1);
    }
    return result;
}
