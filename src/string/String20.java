package string;

import java.util.Scanner;
// TODO
public class String20 {
    public static void main(String[] args) {
        //посчитать и вывести сумму чисел в строке
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String line = scanner.nextLine();
        System.out.println(sum(line));
    }

    public static int sum(String line) {
        int sum = 0;

        for (int i = 0; i < line.length(); i++) {
            if(Character.isLetter(line.charAt(i))){
                break;
            } else {
                if(Character.isDigit(line.charAt(i))){
                    String str = line.charAt(i) + "";
                    sum = sum + Integer.parseInt(str);
                }
            }
        }
        return sum;
    }
}
