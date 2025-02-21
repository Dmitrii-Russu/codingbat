import java.util.function.Function;
  /**
 * Given a string name, return a greeting of the form "Hello name!".
 * For example, "Bob" yields "Hello Bob!".
 *
 * @param name the input name
 * @return a greeting string in the form "Hello name!"
 */

public String helloName(String name) { return "Hello " + name + "!";}

public String helloName(String name) {
    Function<String, String> helloFunction = n -> "Hello " + n + "!";
    return helloFunction.apply(name);
}
