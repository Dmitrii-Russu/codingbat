/**
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 * @param strings the input list of strings
 * @return the modified list where "*" is added to the end of each string
 */

public List<String> addStar(List<String> strings) {
    strings.replaceAll(i -> i + "*");
    return strings;
}

public List<String> addStar(List<String> strings) {
    return strings.stream().map(i -> i + "*").toList();
}
