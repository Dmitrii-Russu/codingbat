/**
 * Given a list of strings, return a list of the strings, omitting any string that contains a "z".
 *
 * @param strings the input list of strings
 * @return the modified list without strings containing "z"
 */

public List<String> noZ(List<String> strings) {
    return strings.stream()
                  .filter(i -> !i.contains("z"))
                  .toList();
}

public List<String> noZ(List<String> strings) {
    strings.removeIf(i -> i.contains("z"));
    return strings;
}
