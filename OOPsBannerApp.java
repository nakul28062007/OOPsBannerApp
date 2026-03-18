/**
 * OOPSBannerApp UC6 - OOPSBannerApp UC5 - Using static method to print banner
 * @author Nakulvasudev T
 * @version 6.0
 */

public class OOPsBannerApp {
        public static void main(String[] args) {
        System.out.println("OOPS Banner static method:");    
        printBanner();
        }

    public static void printBanner(){

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
