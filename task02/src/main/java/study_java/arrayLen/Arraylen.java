package study_java.arrayLen;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arraylen {
    public static void evaluateArrLen() {
        boolean check = true;
        Integer arrLen = 0;
        int maxLenIndex = 0;
        String[] arrStr;
        String regexSplit = "[A-Za-zА-Яа-я]*";
        Pattern pattern = Pattern.compile(regexSplit);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length.");
        do {
            check = true;
            try {
                arrLen = Integer.parseInt(scanner.nextLine());
                if (arrLen <= 0) check = false;
            } catch (NumberFormatException e) {
                check = false;
            }
            if (!check) System.out.println("Entered number is incorrect.");
        } while (!check);

        arrStr = new String[arrLen];
        System.out.println("Please enter " + arrLen + " words");
        for (int i = 0; i < arrLen; i++) {
            String checkStr = null;
            do {
                check = true;
                checkStr = scanner.nextLine();
                Matcher matcher = pattern.matcher(checkStr);
                if(!matcher.matches()) {
                    check = false;
                    System.out.println("The entered word must be alfabetic only. Please write another word.");
                }
            } while(!check);
            arrStr[i] = checkStr;
            if(arrStr[maxLenIndex].length() < arrStr[i].length()) maxLenIndex = i;
        }
        System.out.println("The longest word is " + arrStr[maxLenIndex]);
        scanner.close();
    }
}
