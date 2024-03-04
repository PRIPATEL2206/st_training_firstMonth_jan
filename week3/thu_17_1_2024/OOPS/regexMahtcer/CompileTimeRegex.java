package regexMahtcer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CompileTimeRegex {

    private final String regex;

    public CompileTimeRegex(String regex) {
        this.regex = regex;
    }

    public boolean matches(String input) {
        return matches(regex, input);
    }

    private static boolean matches(String regex, String input) {
        Pattern pattern = Pattern.compile(parse(regex));
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static String parse(String regex) {
        StringBuilder parsedRegex = new StringBuilder();

        char[] chars = regex.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (currentChar == '*') {
                // Kleene star
                parsedRegex.append(".*");
            } else {
                // Literal character
                parsedRegex.append(currentChar);
            }
        }

        return parsedRegex.toString();
    }
}
