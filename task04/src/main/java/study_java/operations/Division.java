package study_java.operations;

import study_java.arguments.Argument;

public class Division extends Operation implements Execution {
    public Division(Argument firstArg, Argument secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public double executeOperation() {
        return getFirstArgValue() / getSecondArgValue();
    }
}