package study_java.calc;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    public static void evaluateCalc() {
        DecimalFormat df = new DecimalFormat("#.####");
        String expression, operation;
        String regexSplit = "(\\+|\\-|\\/|\\*)";
        Pattern pattern;
        boolean check = true;
        String[] splitedExpr;
        double first_num, second_num;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter calc expression with operation +-/*. Example: 2 + 3.22");
        do {
            expression = scanner.next().replaceAll(" ", "");
            pattern = Pattern.compile(regexSplit);
            splitedExpr = pattern.split(expression);
            if (splitedExpr.length == 2) {
                try {
                    first_num = Double.parseDouble(splitedExpr[0]);
                    second_num = Double.parseDouble(splitedExpr[1]);

                    Matcher matcher = pattern.matcher(expression);
                    matcher.find();
                    operation = matcher.group();
                    switch (operation) {
                        case ("+"):
                            result = first_num + second_num;
                            break;
                        case ("-"):
                            result = first_num - second_num;
                            break;
                        case ("/"):
                            result = first_num / second_num;
                            break;
                        case ("*"):
                            result = first_num * second_num;
                            break;
                    }
                } catch (NumberFormatException e) {
                    check = false;
                    System.out.println("One of the entered numbers is incorrect. Please enter the expression again.");
                }
            } else {
                check = false;
                System.out.println("The entered expression has incorrect operation.");
            }
        } while (!check);
        System.out.printf("The result is %s", df.format(result));
    }
}
