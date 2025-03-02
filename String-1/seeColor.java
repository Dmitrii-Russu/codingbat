/**
 * Given a string, if the string begins with "red" or "blue", return that color string,
 * otherwise return the empty string.
 * For example, the string "redapple" yields "red", while "greenapple" yields "".
 *
 * @param str the input string
 * @return "red" if the string starts with "red", "blue" if it starts with "blue",
 *         otherwise an empty string
 */

public String seeColor(String str) {
  
  if(str.startsWith("red")) return "red"; 
  else if(str.startsWith("blue")) return "blue";
  return "";
}
  
public String seeColor(String str) {
  
    return Stream.of("red", "blue").filter(str::startsWith).findFirst().orElse("");
}
