import java.util.ArrayList;

public class HaikuChecker {
    private static boolean is_a_vowel(char codePoint) {
        return switch (codePoint) {
            case 'a', 'e', 'i', 'o', 'u', 'y' -> true;
            default -> false;
        };
    }

    private static boolean validInput(String haiku) {
        for (int i = 0; i < haiku.length(); i++) {
            char c = haiku.charAt(i);

            // Check if character is a letter (A-Z or a-z)
            if (!((c >= 'a' && c <= 'z'))) {
                // Check if character is a punctuation mark or '/'
                if (!isPunctuationOrSlash(c)) {
                    // If character is not a letter or a valid punctuation mark, return false
                    return false;
                }
            }
        }
        return true;
    }

    public static String checkHaiku(String haiku) {
        var line = 0;
        final var syllables = new ArrayList<Integer>(3);
        var currentLineSyllables = 0;

        final var codePoints = haiku.codePoints().mapToObj(c -> (char) c).iterator();

        while (codePoints.hasNext() && line < 3) {
            var codePoint = codePoints.next();

            // Минавам на следваща гласна
            if (isVowel(codePoint)) {
                ++currentLineSyllables;
                while (codePoints.hasNext() && switch (codePoint = codePoints.next()) {
                    case 'a', 'e', 'i', 'o', 'u', 'y' -> true;
                    default -> false;
                });}

            if (codePoint == '/') {
                syllables.add(currentLineSyllables);
                currentLineSyllables = 0;
                ++line;
            }}

        syllables.add(currentLineSyllables);


    }

    public static void main(String[] args) {
        System.out.println(check_if_haiku("happy purple frog/eating bugs in the marshes/get indigestion computer"));
    }}

