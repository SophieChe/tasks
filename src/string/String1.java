package string;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        char firstLetter = str.charAt(0);
        System.out.println(firstLetter);
        String[] array2 = str.split(" ");
        String word = array2[0];
        char letter = word.charAt(0);
        System.out.println(letter);

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
        char[] arrayLetter =  {'i', 'e', 'o', 'u', 'y'};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayLetter.length; j++) {
                if(array[i] == arrayLetter[j]){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
