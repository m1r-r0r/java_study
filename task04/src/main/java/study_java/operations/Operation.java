package study_java.operations;

import study_java.arguments.Argument;

public abstract class Operation {
    private Argument firstArg, secondArg;

    public Operation(Argument firstArg, Argument secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public double getFirstArgValue() {
        return firstArg.getArg();
    }

    public double getSecondArgValue() {
        return secondArg.getArg();
    }
}
