/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,  
 * or return 0 if neither is in that range.  
 *
 * @param a the first integer  
 * @param b the second integer  
 * @return the larger value in the range 10..20, or 0 if neither is in the range  
 */

public int max1020(int a, int b) {
    
    if (a < 10 || a > 20) a = 0;
    if (b < 10 || b > 20) b = 0;
    
    return Math.max(a, b);
}
