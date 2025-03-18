import java.util.stream.IntStream;
/*
 * Solutions to the "countXX" problem.
 * Given a string, return the number of times "xx" appears in the string.
 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */

public int countXX(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("xx")) {
          count++;
        }
    }
    return count;
}

public int countXX(String str) {
  int count = 0;
  for(int i = 0; i < str.length()-1; i++)
  if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x')
  count++;
  return count;
}

public int countXX(String str) {
  return (int) IntStream.range(0, str.length() - 1)
                  .filter(i -> str.substring(i, i + 2).equals("xx"))
                      .count();
}
