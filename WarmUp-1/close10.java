/**
 * Given two integer values, return whichever value is nearest to 10,  
 * or return 0 in the event of a tie. 
 *
 * @param a the first integer
 * @param b the second integer
 * @return the value closest to 10, or 0 if both are equally close
 */

public int close10(int a, int b) {
    
  int distA = Math.abs(a - 10);
  int distB = Math.abs(b - 10);

  if (distA < distB) return a;
  else if (distA > distB) return b;
  else return 0;
}
