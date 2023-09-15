package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TODO  теория: что такое hashcode, отличие сетов

public class Collection3 {
    static List<String> emails = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equals("LIST")) {
                printList();
            } else if (input.equals("ADD")) {
                System.out.println("Введите email для добавления");
                String inputAdd = scanner.next();
                addEmail(inputAdd);
            } else if (input.equals("DELETE")) {
                System.out.println("Введите email для удаления");
                String inputDelete = scanner.next();
                deleteEmail(inputDelete);
            } else if (input.equals("UPDATE")) {
                System.out.println("введите номер элемента для обновления и обновленный email ");
                int i = scanner.nextInt();
                String inputUpdate = scanner.next();
                updateEmail(i, inputUpdate);
            } else {
                System.out.println("такой команды нет");
            }
        }

    }

    public static void printList() {
        for (int i = 0; i < emails.size(); i++) {
            System.out.println(emails.get(i));
        }
    }

    public static void addEmail(String input) {
        //TODO проверить есть ли такой емейл
        //TODO через регулярное выражение проверить емейл ли это
        String regular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isEmailValid = input.matches(regular);
        if (isEmailValid) {
            if (emails.contains(input)) {
                System.out.println("такой email уже есть");
            } else {
                emails.add(input);
                System.out.println("добавлен email:" + input);
            }
        } else {
            System.out.println("введен не email");
        }

    }

    //TODO удаление емейла
    public static void deleteEmail(String input) {
        emails.remove(input);
    }

    //TODO исправление емейла
    public static void updateEmail(int i, String input) {
        emails.set(i, input);
    }

}
