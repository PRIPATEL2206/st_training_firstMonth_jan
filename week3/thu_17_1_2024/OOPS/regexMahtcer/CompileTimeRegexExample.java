package regexMahtcer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompileTimeRegexExample {

    public static void main(String[] args) {
        // Compile-time regular expression: a*b
        CompileTimeRegex regex = new CompileTimeRegex("a*b");

        // Test matching
        System.out.println(regex.matches("ab"));      // true
        System.out.println(regex.matches("aaaab"));   // true
        System.out.println(regex.matches("b"));       // true
        System.out.println(regex.matches("ac"));      // false
    }
}
