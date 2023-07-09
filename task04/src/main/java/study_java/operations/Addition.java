package study_java.operations;

import study_java.arguments.Argument;

public class Addition extends Operation implements Execution {
    public Addition(Argument firstArg, Argument secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public double executeOperation() {
        return getFirstArgValue() + getSecondArgValue();
    }
}