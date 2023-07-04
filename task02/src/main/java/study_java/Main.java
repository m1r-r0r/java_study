package study_java;

import study_java.arrayLen.Arraylen;
import study_java.calc.Calc;
import java.util.*;

/**
 * @author out-bazhin-sa
 *
 */
public class Main {

    public static void main(String[] args) {
        boolean check;
        Integer taskNum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of task (1 or 2).");
        do {
            check = true;
            try {
                taskNum = Integer.parseInt(scanner.nextLine());
                if(!(taskNum == 1 || taskNum == 2)) check = false;
            } catch (NumberFormatException e) {
                check = false;
            }
            if(!check) System.out.println("Incorrect number of task, please try again.");
        } while (!check);
        switch (taskNum) {
            case (1):
                Calc.evaluateCalc();
                break;
            case (2):
                Arraylen.evaluateArrLen();
                break;
        }
        scanner.close();
    }
}