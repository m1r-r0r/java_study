package study_java.sweet;

public class Candy extends Sweet{
    private String ingredient;
    public Candy(String name, int weight, int price, String ingredient) {
        super(name, weight, price);
        this.ingredient = ingredient;
    }

    @Override
    public void printSweet() {
        super.printSweet();
        System.out.print(this.ingredient);
    }
}
