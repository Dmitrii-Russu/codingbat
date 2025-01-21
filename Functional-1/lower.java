/**
 * Given a list of strings, return a list where each string is converted to lower case.
 *
 * @param strings the input list of strings
 * @return the modified list where each string is in lower case
 */

public List<String> lower(List<String> strings) {
    strings.replaceAll(String::toLowerCase);
    return strings;
}

public List<String> lower(List<String> strings) {
    return strings.stream().map(String::toLowerCase).toList();
}
