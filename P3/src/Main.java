import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple match
        String text = "The quick brown fox jumps over the lazy dog";
        String pattern1 = "fox";
        boolean isMatch1 = Pattern.matches(pattern1, text);
        System.out.println("Example 1 - Simple match:");
        System.out.println("Is 'fox' present in the text? " + isMatch1);

        // Example 2: Finding matches
        String pattern2 = "\\b\\w{4}\\b"; // Match 4-letter words
        Pattern p2 = Pattern.compile(pattern2);
        Matcher matcher2 = p2.matcher(text);
        System.out.println("\nExample 2 - Finding matches:");
        System.out.print("Four-letter words in the text: ");
        while (matcher2.find()) {
            System.out.print(matcher2.group() + " ");
        }

        // Example 3: Extracting groups
        String input = "John: 123, Mary: 456, Bob: 789";
        String pattern3 = "(\\w+): (\\d+)";
        Pattern p3 = Pattern.compile(pattern3);
        Matcher matcher3 = p3.matcher(input);
        System.out.println("\n\nExample 3 - Extracting groups:");
        while (matcher3.find()) {
            System.out.println("Name: " + matcher3.group(1) + ", ID: " + matcher3.group(2));
        }

        // Example 4: Replacement
        String input2 = "The cat sat on the mat.";
        String pattern4 = "\\bcat\\b";
        String replacement = "dog";
        String result = input2.replaceAll(pattern4, replacement);
        System.out.println("\nExample 4 - Replacement:");
        System.out.println("Original: " + input2);
        System.out.println("After replacement: " + result);
    }
}