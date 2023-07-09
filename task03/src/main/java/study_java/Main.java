package study_java;

import study_java.intArray.IntArray;
import study_java.sweet.Candy;
import study_java.sweet.Etc;
import study_java.sweet.Jellybean;
import study_java.sweet.Sweet;

/**
 * @author out-bazhin-sa
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("First task:");
        System.out.println("В случае наличия нескольких одинаковых максимальных или минимальных чисел для целей задачи будет использовано первое из них.");
        IntArray intArray = new IntArray();
        System.out.print("Original:\t");
        intArray.printIntArray();
        intArray.reverseIntArray();
        if(intArray.getCheck()) {
            System.out.print("Reversed:\t");
            intArray.printIntArray();
        }
        else System.out.println("Этот массив не содержит минимальное положительное или максимальное отрицательное число.");


        System.out.println();
        System.out.println("Second task:");

        Sweet[] gifts = {
                new Etc("Печенье Юбилейное", 100, 30, "Традиционное"),
                new Candy("Конфеты Левушка", 250, 190, "Шоколадные"),
                new Candy("Конфеты Коровка",250, 260, "Сгущеное молоко"),
                new Jellybean("Мармелад Fruit-tella", 100, 70, "Кола"),
                new Jellybean("Мармелад Мармеландия",250,170,"Фрукты")
        };
        int totalWeight = 0;
        int totalPrice = 0;
        Sweet.printTitle();
        for(Sweet gift: gifts) {
            totalWeight += gift.getWeight();
            totalPrice += gift.getPrice();
            gift.printSweet();
            System.out.println();
        }
        System.out.printf("\nОбщий вес: " + totalWeight + " гр., общая стоимость: " + totalPrice + " руб.");
    }
}