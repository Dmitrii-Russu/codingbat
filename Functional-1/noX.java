/**
 * Given a list of strings, return a list where each string has all its "x" removed.
 *
 * @param strings the input list of strings
 * @return the modified list where each string has all its "x" removed
 */

public List<String> noX(List<String> strings) {
    return strings.stream().map(i -> i.replace("x", "")).toList();
}

public List<String> noX(List<String> strings) {
    strings.replaceAll(i -> i.replace("x", ""));
    return strings;
}
