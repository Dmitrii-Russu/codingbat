/**
 * Given a string, return a string made of the first 2 chars (if present).
 * Include the first char only if it is 'o' and include the second char
 * only if it is 'z'. For example, "ozymandias" yields "oz".
 *
 * @param str the input string
 * @return a string made of the first two chars based on the conditions
 */


public String startOz(String str) {
    String result = "";
    if (str.length() > 0 && str.charAt(0) == 'o') {
        result = result + str.charAt(0);
    }
    if (str.length() > 1 && str.charAt(1) == 'z') {
        result = result + str.charAt(1);
    }
    return result;
}
