/*
 * Solution to the "stringTimes" problem.
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */

public String stringTimes(String str, int n) {
    // Handle edge case when n is 0
    if (n == 0) {
        return "";
    }
    
    // Convert the string to a character array
    char[] chars = str.toCharArray();
    // Create a result array large enough to hold n copies
    char[] result = new char[chars.length * n];
    
    // Copy the original string n times into the result array
    int index = 0;
    for (int repeat = 0; repeat < n; repeat++) {
        for (int i = 0; i < chars.length; i++) {
            result[index++] = chars[i];
        }
    }
    
    // Convert the character array back to a string
    return new String(result);
}

public String stringTimes(String str, int n) {
  char[] chars = str.toCharArray();
    char[] result = new char[chars.length * n];
    for (int i = 0; i < result.length; i++) {
        result[i] = chars[i % chars.length];
    }
    return new String(result);
}
