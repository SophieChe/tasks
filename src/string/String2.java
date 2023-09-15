package string;

import java.util.Arrays;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        // 1 ввести n строк с консоли, найти самую короткую строку, вывести строку и ее длину
        System.out.println("Ввести количество строк");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Ввести строки");
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        String max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < max.length()) {
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println("длина строки: " + max);

        //2 ввести n строк с консоли, упорядочить и вывести строки в порядке возрастания их длин,
        // а так же (второй приоритет)значения длины строк
        String str = null;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() < array[j].length()) {
                    str = array[i];
                    array[i] = array[j];
                    array[j] = str;
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j].length());
        }
    }
}
