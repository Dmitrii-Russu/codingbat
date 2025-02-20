/**
 * Given a string, return a version where all the "x" have been removed,
 * except an "x" at the very start or end should not be removed.
 *
 * @param str the input string
 * @return the modified string with "x" removed, except at the start and end
 */

public String stringX(String str) {

    if (str.length() <= 2) {
        return str;
    } else {
        String middle = str.substring(1, str.length() - 1).replace("x", "");
        return str.charAt(0) + middle + str.charAt(str.length() - 1);
    }
}

public String stringX(String str) {

    if(str.length() <= 2) return str;
    String result = "";
    for(int i = 1; i < str.length()-1; i++) {
        if(str.charAt(i) == 'x') continue;
        result += str.charAt(i);
    }
    return str.charAt(0) + result + str.charAt(str.length()-1);
}