package study_java.sweet;

public class Etc extends Sweet{
    private String etc;
    public Etc(String name, int weight, int price, String etc) {
        super(name, weight, price);
        this.etc = etc;
    }

    @Override
    public void printSweet() {
        super.printSweet();
        System.out.printf(this.etc);
    }
}
