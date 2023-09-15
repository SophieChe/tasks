package collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Вам даны две строки A и B. Определите, существует ли непустая строка,
// которая встречается как подстрока и в A, и в B.
//Input Format
//В первой строке записано целое число T - количество тестов.
// Далее следуют сами тесты. Каждый тест описывается двумя строками,
// в первой из которых записана строка A, а во второй строка B.
//Output Format
//Для каждого теста выведите ответ: строку YES, либо строку NO.
//Все строки состоят из строчных символов латинского алфавита.

public class Collection5HW {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int test = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < test; i++) {
//            String str1 = scanner.nextLine();
//            String str2 = scanner.nextLine();
//            if (checkLine(str1) && checkLine(str2)) {
//                boolean check = false;
//                for (int j = 0; j < str1.length(); j++) {
//                    if (str2.contains(str1.substring(j))) {
//                        check = true;
//                        break;
//                    }
//                }
//                if (check) {
//                    System.out.println("YES");
//                } else {
//                    System.out.println("NO");
//                }
//            } else {
//                System.out.println("Все строки должны состоять из строчных символов латинского алфавита.");
//            }
//        }

        System.out.println(twoStrings("hello", "world"));
    }

//    public static boolean checkLine(String str) {
//        //String regular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
//        String regex = "^[A-Za-z]+$";
//        boolean checkLine = str.matches(regex);
//        if (checkLine) {
//            return true;
//        }
//        return false;
//    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here

        Set<Character> str1 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            str1.add(s1.charAt(i));
        }
        Set<Character> str2 = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            str2.add(s2.charAt(i));
        }

           str1.retainAll(str2);

        if(str1.size() > 0){
            return "YES";
        }
           return "NO";
    }
}
