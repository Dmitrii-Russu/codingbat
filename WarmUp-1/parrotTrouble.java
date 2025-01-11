/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 *
 * @param talking indicates if the parrot is talking
 * @param hour the current hour time in the range 0..23
 * @return true if we are in trouble, false otherwise
 */


public boolean parrotTrouble(boolean talking, int hour) {
    return (hour < 7 || hour > 20) && talking;
}
