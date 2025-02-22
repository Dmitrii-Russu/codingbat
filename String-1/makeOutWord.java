/**
 * Given an "out" string of length 4, such as "<<>>", and a word,  
 * return a new string where the word is placed in the middle of the out string.  
 * For example, makeOutWord("<<>>", "word") returns "<<word>>".
 *
 * @param out the outer string of length 4
 * @param word the word to insert in the middle
 * @return a new string with the word placed inside the out string
 */

public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(2);
}
