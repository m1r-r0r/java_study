package study_java.arguments;

public class Argument {
    double arg;

    public Argument(String arg) throws NumberFormatException {
        this.arg = Double.parseDouble(arg);
    }

    public double getArg() {
        return this.arg;
    }
}
