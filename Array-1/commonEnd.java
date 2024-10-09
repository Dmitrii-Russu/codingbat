/**
 * The commonEnd method checks if two arrays have the same first element
 * or the same last element.
 * Both arrays will have a length of 1 or more.
 *
 * @param a the first array of integers.
 * @param b the second array of integers.
 * @return true if the first elements of both arrays are the same or the last elements are the same; false otherwise.
 */

public boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length - 1] == b[b.length - 1]; // Checks if the first or last element of both arrays is the same
}
