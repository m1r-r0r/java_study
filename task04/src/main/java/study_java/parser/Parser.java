package study_java.parser;

import study_java.arguments.Argument;
import study_java.operations.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    static String regexSplit = "(\\+|\\-|\\/|\\*)";

    public static Execution setExecution() {
        boolean check;
        Argument firstArg, secondArg;
        Execution operation = null;
        Pattern pattern;
        String[] splitedExpr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter calc expression with operation +-/*. Example: 2 + 3.22");
        do {
            check = true;
            String expression = scanner.nextLine().replaceAll(" ", "");
            pattern = Pattern.compile(regexSplit);
            splitedExpr = pattern.split(expression);
            if (splitedExpr.length == 2) {
                try {
                    firstArg = new Argument(splitedExpr[0]);
                    secondArg = new Argument(splitedExpr[1]);

                    Matcher matcher = pattern.matcher(expression);
                    matcher.find();
                    switch (matcher.group()) {
                        case ("+"):
                            operation = new Addition(firstArg, secondArg);
                            break;
                        case ("-"): operation = new Substruction(firstArg, secondArg);
                            break;
                        case ("/"):
                            operation = new Division(firstArg, secondArg);
                            break;
                        case ("*"):
                            operation = new Multiplication(firstArg, secondArg);
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
        scanner.close();
        return operation;
    }
}
