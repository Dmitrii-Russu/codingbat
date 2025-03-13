/**
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
 *
 * @param tag the HTML tag to be used (e.g., "i" for italic)
 * @param word the word to be enclosed within the HTML tags
 * @return the HTML string with the word enclosed in the specified tags
 */

public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
}
