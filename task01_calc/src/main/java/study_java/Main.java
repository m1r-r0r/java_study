package study_java;

import java.text.DecimalFormat;
import java.util.*;

/**
 * @author out-bazhin-sa
 * @see #getNumber(String, Scanner)
 *
 */
public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");

        double first_num, second_num;

        Scanner scanner = new Scanner(System.in);
        first_num = getNumber("first", scanner);
        second_num = getNumber("second", scanner);

        double result = first_num + second_num;
        System.out.printf("The sum is %s", df.format(result));
    }

    /**
     *
     * @param request_num string with label of number
     * @param scanner is used to get entered numbers
     * @return entered number
     */
    private static double getNumber(String request_num, Scanner scanner) {
        double number = 0;
        Boolean num_check = true;
        System.out.println("Please enter " + request_num + " number.");
        do {
            try {
                number = Float.parseFloat(scanner.next());
                num_check = true;
            } catch (NumberFormatException e) {
                num_check = false;
                System.out.println("The entered string is not number. Please enter number again.");
            }
        } while (!num_check);
        return number;
    }
}