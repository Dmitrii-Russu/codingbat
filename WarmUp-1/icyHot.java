/**
 * Given two temperatures, return true if one is less than 0
 * and the other is greater than 100.
 *
 * @param temp1 the first temperature
 * @param temp2 the second temperature
 * @return true if one temperature is less than 0 and the other is greater than 100
 */

public boolean icyHot(int temp1, int temp2) {
    return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
}

