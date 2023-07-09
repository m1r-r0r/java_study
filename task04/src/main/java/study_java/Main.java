package study_java;

import study_java.operations.Execution;
import study_java.parser.Parser;

import java.text.DecimalFormat;

/**
 * @author out-bazhin-sa
 *
 */
public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");
        Execution execution = Parser.setExecution();
        double result = execution.executeOperation();
        System.out.printf("The result is %s", df.format(result));
    }
}