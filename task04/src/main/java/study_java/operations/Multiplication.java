package study_java.operations;

import study_java.arguments.Argument;

public class Multiplication extends Operation implements Execution {
    public Multiplication(Argument firstArg, Argument secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public double executeOperation() {
        return getFirstArgValue() * getSecondArgValue();
    }
}