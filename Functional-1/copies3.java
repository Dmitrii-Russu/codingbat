/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
 *
 * @param strings the input list of strings
 * @return the modified list where each string is replaced by 3 concatenated copies
 */

public List<String> copies3(List<String> strings) {
    strings.replaceAll(i -> i + i + i);
    return strings;
}

public List<String> copies3(List<String> strings) {
    return strings.stream().map(i -> i + i + i).toList();
}
