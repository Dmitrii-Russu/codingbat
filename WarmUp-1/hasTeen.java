import java.util.stream.IntStream;
import java.util.function.IntPredicate;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 *
 * @param a first integer
 * @param b second integer
 * @param c third integer
 * @return true if at least one of the numbers is in the range 13-19, otherwise false
 */

public boolean hasTeen(int a, int b, int c) {
  
  return IntStream.of(a, b, c).anyMatch(num -> num >= 13 && num <= 19);
}

public boolean hasTeen(int a, int b, int c) {
  
    IntPredicate isTeen = num -> num >= 13 && num <= 19;
    return isTeen.test(a) || isTeen.test(b) || isTeen.test(c);
}

public boolean hasTeen(int a, int b, int c) {
  
  for(int i = 13; i < 20; i++)
  if(a == i || b == i || c == i) return true;
  return false;
}

public boolean hasTeen(int a, int b, int c) {

  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
}
