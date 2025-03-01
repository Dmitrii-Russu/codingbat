/**
 * When squirrels get together for a party, they like to have cigars. 
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 *
 * @param cigars the number of cigars
 * @param isWeekend true if it is the weekend, false otherwise
 * @return true if the party is successful, false otherwise
 */

public boolean cigarParty(int cigars, boolean isWeekend) { 
  return cigars > 39 && (isWeekend || cigars < 61); 
}

public boolean cigarParty(int cigars, boolean isWeekend) { 
  boolean result1 = cigars > 39 && isWeekend;
  boolean result2 = cigars > 39 && cigars < 61 && !isWeekend;
  return result1 || result2;
}

public boolean cigarParty(int cigars, boolean isWeekend) { 
  if (cigars > 39 && cigars < 61 && !isWeekend) return true;
  else if (cigars > 39 && isWeekend) return true;
  else return false;
}

public boolean cigarParty(int cigars, boolean isWeekend) { 
  return cigars > 39 && isWeekend || cigars > 39 && cigars < 61 && !isWeekend;
}
