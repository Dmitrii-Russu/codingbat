/**
 * Return a version of the given string, where for every star (*) in the string
 * the star and the chars immediately to its left and right are gone.
 * For example, "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 *
 * @param str the input string
 * @return the resulting string with stars and adjacent characters removed
 */

public String starOut(String str) {
  
    String[] x = str.split("");
    for (int i = 0; i < x.length; i++) {
        if ("*".equals(x[i])) {
            x[i] = "";
            if (i > 0) {
                x[i - 1] = "";
            }
            if (i < x.length - 1) {
                if (!"*".equals(x[i + 1])) {
                    x[i + 1] = "";
                    i++;
                }
            }
        }
    }
    return String.join("", x);
}
