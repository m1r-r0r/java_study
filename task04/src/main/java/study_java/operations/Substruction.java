package study_java.operations;

import study_java.arguments.Argument;

public class Substruction extends Operation implements Execution {
    public Substruction(Argument firstArg, Argument secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public double executeOperation() {
        return getFirstArgValue() - getSecondArgValue();
    }
}