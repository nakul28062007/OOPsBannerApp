/**
 * OOPSBannerApp UC4 - OOPSBannerApp UC5 - Inline Array Initialization
 * @author Nakulvasudev T
 * @version 5.0
 */

public class OOPsBannerApp {

    public static void main(String[] args) {

        // Create String array with 7 banner lines
        String[] lines = {
        String.join(" ", "  *****  ", "  *****  ", " ********", " ******* "),
        String.join(" ", " *     * ", " *     * ", " *      *", " *      *"),
        String.join(" ", " *     * ", " *     * ", " *      *", " *       "),
        String.join(" ", " *     * ", " *     * ", " ********", "  ****** "),
        String.join(" ", " *     * ", " *     * ", " *       ", "       * "),
        String.join(" ", " *     * ", " *     * ", " *       ", " *      *"),
        String.join(" ", "  *****  ", "  *****  ", " *       ", "  ****** "),
        };
        // Enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
