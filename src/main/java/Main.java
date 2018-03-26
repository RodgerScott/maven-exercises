import org.apache.commons.lang3.StringUtils;

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
    }
}
