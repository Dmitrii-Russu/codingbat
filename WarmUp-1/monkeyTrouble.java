/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile
 * indicate if each is smiling. We are in trouble if they are both smiling
 * or if neither of them is smiling. Return true if we are in trouble.
 *
 * @param aSmile indicates if monkey a is smiling
 * @param bSmile indicates if monkey b is smiling
 * @return true if we are in trouble, false otherwise
 */
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
}
