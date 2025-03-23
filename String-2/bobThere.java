/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
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
