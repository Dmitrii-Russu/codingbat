/**
 * Return true if the given string contains a "bob" string, 
 * but where the middle 'o' char can be any char.
 *
 * @param str the input string
 * @return true if the pattern "b.b" is found, false otherwise
 */
public boolean bobThere(String str) {
    String[] x = str.split("");
    for (int i = 0; i < x.length - 2; i++) {
        if (x[i].equals("b") && x[i + 2].equals("b")) {
            return true;
        }
    }
    return false;
}

/**
 * Return a string made of n repetitions of the last n characters 
 * of the string. You may assume that n is between 0 and the length 
 * of the string, inclusive.
 *
 * @param str the input string
 * @param n the number of characters to repeat
 * @return the resulting repeated string
 */

public String repeatEnd(String str, int n) {
    int index = 0;
    String[] chars = str.split("");
    String[] result = new String[n * n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            result[index++] = chars[(chars.length - n) + j];
        }
    }
    return String.join("", result);
}
