/**
 * Given a list of strings, return a list where each string has "y" added at its end,
 * omitting any resulting strings that contain "yy" as a substring anywhere.
 *
 * @param strings the input list of strings
 * @return the modified list with strings ending in "y", excluding those containing "yy"
 */

public List<String> noYY(List<String> strings) {
    return strings.stream().map(i -> i + "y").filter(i -> !i.contains("yy")).toList();
}

public List<String> noYY(List<String> strings) {
    strings.replaceAll(i -> i + "y");
    strings.removeIf(i -> i.contains("yy"));
    return strings;
}
