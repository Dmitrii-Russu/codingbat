import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Given two strings, a and b, return the result of putting them together in the order abba.
 * For example, "Hi" and "Bye" returns "HiByeByeHi".
 *
 * @param a the first input string
 * @param b the second input string
 * @return the concatenated string in the order abba
 */

public String makeAbba(String a, String b) { return a + b + b + a;}

public String makeAbba(String a, String b) {
    return Stream.of(a, b, b, a).collect(Collectors.joining());
}
