/**
 * Given a string, return a new string made of every other character 
 * starting with the first. 
 * For example, "Hello" yields "Hlo".
 * 
 * @param str the input string
 * @return a new string with every other character starting from the first
 */

public String stringBits(String str) {
    
    String result = "";
    
    for (int i = 0; i < str.length(); i += 2) {
        result += str.charAt(i);
    }    
    return result;
}
