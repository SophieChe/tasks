package string;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        //11 найти,каких букв гласных или согласных больше в каждом предложении текста
        // текст для проверки: Служба. Поддержки. Клиентов недоступна.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine();
        String[] arraystr = str.split("\\.");
        int countV = 0;
        int countC = 0;
        for (int i = 0; i < arraystr.length; i++) {
            String word = arraystr[i];
            for (int j = 0; j < word.length(); j++) {
                if ("бвгджзйклмнпрстфхцчшщ".indexOf(Character.toLowerCase(word.charAt(j))) != -1 && word.charAt(j) != ' ') {
                    countC = countC + 1;
                } else if (word.charAt(j) != ' ') {
                    countV = countV + 1;
                }
            }
            if (countC > countV) {
                System.out.println("В " + i + "-ом предложении больше согласных букв");
            } else {
                System.out.println("В " + i + "-ом предложении больше гласных букв");
            }
            countC = 0;
            countV = 0;

        }


    }
}
