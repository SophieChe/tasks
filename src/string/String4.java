package string;
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        // 4 В каждом слове текста K-ую букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять
//        System.out.print("Ввести текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
//        System.out.print("Ввести номер символа к замене ");
        int k = scanner.nextInt();
        System.out.print("Ввести заменяющий символ");
        char symbol = scanner.next().charAt(0);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > k) {
                char[] arrayChar = array[i].toCharArray();
                arrayChar[k] = symbol;
                array[i] = String.valueOf(arrayChar);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] +" ");
        }

    }
}
