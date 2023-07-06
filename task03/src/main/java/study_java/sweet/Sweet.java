package study_java.sweet;

public class Sweet {
    private String name;
    private int weight;
    private int price;

    public Sweet(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public static void printTitle(){
        System.out.printf("%-25s %-10s %-15s", "Название", "Вес,гр.", "Цена,руб.");
        System.out.println("Свой уникальный параметр");
    }

    public void printSweet() {
        System.out.printf("%-25s %-10s %-15s", this.name, this.weight, this.price);
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPrice() {
        return this.price;
    }
}
