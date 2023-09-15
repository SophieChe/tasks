package string;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String word = scanner.nextLine();

        if(isPolendrome(word)) {
            System.out.println("слово является полендромом");
        } else {
            System.out.println("слово не является полендромом");
        }
    }

    public static boolean isPolendrome(String word) {
        int length = word.length() / 2;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
