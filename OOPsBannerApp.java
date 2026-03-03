/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * Refactored using String.join() instead of + operator
 *
 * @author Nakulvasudev T
 * @version 3.0
 */

public class OOPsBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                " ********",
                " ******* "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *      *",
                " *      *"));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *      *",
                " *       "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " ********",
                "  ****** "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *      *"));

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  ****** "));

    }
}