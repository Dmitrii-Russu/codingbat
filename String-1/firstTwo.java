import java.util.stream.IntStream;
import java.util.stream.Collectors;

/**
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X",
 * and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
 *
 * @param str the input string
 * @return the first two characters of the string, or the entire string if it's shorter than 2 characters
 */

public String firstTwo(String str) {
    return str.length() < 2 ? str : str.substring(0, 2);
}

public String firstTwo(String str) {
    return IntStream.range(0, str.length())
            .limit(2)
            .mapToObj(str::charAt)
            .map(String::valueOf)
            .collect(Collectors.joining());
}
