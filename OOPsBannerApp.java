/**
 * OOPSBannerApp UC7 - OOPSBannerApp UC5 - Using Inner static method to print banner
 * @author Nakulvasudev T
 * @version 8.0
 */
import java.util.Map;
import java.util.LinkedHashMap;
public class OOPsBannerApp {
    public static void main(String[] args) {
        System.out.println("OOPS Banner Using Innner static method:");
        BannerPrinter.printBanner();
    }

    static class BannerPrinter {

        public static void printBanner(){
            Map<Integer, String> lines = new LinkedHashMap<>();
            lines.put(1, "  *****    *****   ********  *******");
            lines.put(2, " *     *  *     *  *      *  *");
            lines.put(3, " *     *  *     *  *      *  * ");
            lines.put(4, " *     *  *     *  ********  *******");
            lines.put(5, " *     *  *     *  *               *");
            lines.put(6, " *     *  *     *  *               *");
            lines.put(7, "  *****    *****   *         *******");
            for(String line : lines.values()){
                System.out.println(line);
            }
        }
    }
}