package study_java.sweet;

public class Jellybean extends Sweet{
    private String taste;
    public Jellybean(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public void printSweet() {
        super.printSweet();
        System.out.printf(this.taste);
    }
}
