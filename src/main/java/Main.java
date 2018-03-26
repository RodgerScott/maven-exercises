import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter Something: ");
        String entry = scan.nextLine();
        System.out.println("You entered: " + "\"" + entry + "\"");
        if (!StringUtils.isNumeric(entry)) {
            System.out.println("\"" + entry + "\"" + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(entry));
        System.out.println("Reversed: " + StringUtils.reverse(entry));
        System.out.println(StringUtils.containsAny(entry, "aeiou"));
    }

    public static boolean stringIsANumber (String input) {
        return StringUtils.isNumeric(input);
    }

    public static String flipTheCase (String input) {
        return StringUtils.swapCase(input);
    }

    public static String reverse (String input) {
        return StringUtils.reverse(input);
    }
}



