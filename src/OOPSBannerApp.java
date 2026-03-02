public class OOPSBannerApp {
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }
    public static CharacterPattern[] createPatterns() {

        String[] O = {
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        };

        String[] P = {
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        };

        String[] S = {
                " ***** ",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                "*****  "
        };

        String[] space = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };

        return new CharacterPattern[]{
                new CharacterPattern('O', O),
                new CharacterPattern('P', P),
                new CharacterPattern('S', S),
                new CharacterPattern(' ', space)
        };
    }
    public static String[] getPattern(char ch, CharacterPattern[] patterns) {
        for (CharacterPattern cp : patterns) {
            if (cp.character == ch) {
                return cp.pattern;
            }
        }
        return patterns[3].pattern;
    }
    public static void printBanner(String message, CharacterPattern[] patterns) {

        for (int row = 0; row < 7; row++) {

            for (char ch : message.toCharArray()) {
                String[] pat = getPattern(ch, patterns);
                System.out.print(pat[row] + "  ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        CharacterPattern[] patterns = createPatterns();

        String message = "OOPS";

        printBanner(message, patterns);
    }
}