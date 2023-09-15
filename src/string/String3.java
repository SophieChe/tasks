package string;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        //3 ввести n строк с консоли, вывести на консоль те строки, длина которых меньше средней,
        // и вывести их длины.
        System.out.println("Ввести количество строк");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Ввести строки");
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i].length();
        }
        int average = count / n;
        System.out.println("average = " + average);
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() < average){
                System.out.println(array[i] + " длина строки = " + array[i].length());
            }
        }
    }
}
