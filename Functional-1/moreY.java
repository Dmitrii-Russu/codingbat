/**
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 *
 * @param strings the input list of strings
 * @return the modified list with "y" added at the start and end of each string
 */

public List<String> moreY(List<String> strings) {
    strings.replaceAll(i -> "y" + i + "y");
    return strings;
}

public List<String> moreY(List<String> strings) {
    strings.replaceAll(i -> "y" + i + "y");
    return strings;
}