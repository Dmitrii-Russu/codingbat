import java.util.stream.IntStream;
import java.util.function.IntPredicate;

/**
 * Given two integer values, return true if either of them is in the range 10..20 inclusive.
 *
 * @param a the first integer
 * @param b the second integer
 * @return true if either a or b is in the range 10 to 20 (inclusive), otherwise false
 */

public boolean in1020(int a, int b) {
  
    return IntStream.of(a, b).anyMatch(i -> i >= 10 && i <= 20);
}

public boolean in1020(int a, int b) {
  
  IntPredicate result = i -> i >= 10 && i <= 20;
  
  return result.test(a) || result.test(b);
}

public boolean in1020(int a, int b) {
  
  for(int i = 10; i < 21; i++)
  if(a == i || b == i) return true;
  return false;
}
