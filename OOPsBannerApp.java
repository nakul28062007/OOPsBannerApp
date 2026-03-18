/**
 * OOPSBannerApp UC7 - OOPSBannerApp UC5 - Using Inner static method to print banner
 * @author Nakulvasudev T
 * @version 7.0
 */

public class OOPsBannerApp {
        public static void main(String[] args) {
        System.out.println("OOPS Banner Using Innner static method:");    
        BannerPrinter.printBanner();
        }

        static class BannerPrinter {
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
}
