import java.util.stream.IntStream;
import java.util.stream.Collectors;

/**
 * Given a non-empty string and an int N, return the string made starting with char 0, 
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
 * N is 1 or more.
 *
 * @param str the input string
 * @param n the step size
 * @return a new string consisting of every Nth character from the input string
 */

public String everyNth(String str, int n) {
    return IntStream.range(0, str.length())
        .filter(i -> i % n == 0)
        .mapToObj(str::charAt)
        .map(String::valueOf)
        .collect(Collectors.joining());
}

public String everyNth(String str, int n) {
    String result = "";
    for (int i = 0; i < str.length(); i += n) {
        result += str.charAt(i);
    }
    return result;
}
