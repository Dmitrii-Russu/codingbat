/**
 * Given a list of strings, return a list of the strings, omitting any string with a length of 4 or more.
 *
 * @param strings the input list of strings
 * @return the modified list with strings of length less than 4
 */

public List<String> noLong(List<String> strings) {
    return strings.stream().filter(s -> s.length() < 4).toList();
}

public List<String> noLong(List<String> strings) {
    strings.removeIf(s -> s.length() >= 4);
    return strings;
}
