/**
 * Given a list of strings, return a list of the strings, omitting any string with a length of 3 or 4.
 *
 * @param strings the input list of strings
 * @return the modified list with strings of length not equal to 3 or 4
 */

public List<String> no34(List<String> strings) {
    return strings.stream().filter(s -> !(s.length() == 3 && s.length() == 4)).toList();
}

public List<String> no34(List<String> strings) {
    strings.removeIf(s -> s.length() == 3 || s.length() == 4);
    return strings;
}
