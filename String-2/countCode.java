import java.util.stream.IntStream
/**
 * Return the number of times that the string "code" appears anywhere in the given string,
 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 *
 * @param str the input string
 * @return the number of occurrences of the pattern "co.e"
 */

public int countCode(String str) {
    return (int) IntStream.range(0, str.length() - 3)
            .filter(i -> str.charAt(i) == 'c' 
                       && str.charAt(i + 1) == 'o' 
                       && str.charAt(i + 3) == 'e')
            .count();
}

public int countCode(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 3; i++) {
        if (str.charAt(i) == 'c' 
            && str.charAt(i + 1) == 'o' 
            && str.charAt(i + 3) == 'e') {
            count++;
        }
    }
    return count;
}
