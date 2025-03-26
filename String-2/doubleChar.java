/**
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 * @param str the input string
 * @return a new string where each character from the original string is duplicated
 */

public String doubleChar(String str) {
  int index = 0;
  String[] chars = str.split("");
  String[] result = new String[chars.length * 2];
  for(int i = 0; i < chars.length; i++) {
    result[index++] = chars[i];
    result[index++] = chars[i];
  }
  return String.join("", result);
}

public String doubleChar(String str) {
    return Arrays.stream(str.split("")).map(s -> s + s).collect(Collectors.joining()); 
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

public String doubleChar(String str) {  
   String[] chars = str.split("");
   String[] result = new String[chars.length * 2];
   for(int i = 0; i < chars.length; i++) {
    result[i * 2] = chars[i];
    result[i * 2 + 1] = chars[i];
  }
  return String.join("", result);
}
