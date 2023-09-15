package collection;

import java.util.HashMap;
import java.util.Scanner;

//всего в здании n этажей, ноутбуки хранятся на одном из них
//егор прашвает полину, они отвечает yes/no
//егор перечисляет номера этажей, если есть этаж с ноутбуками, полина отвечает yes, иначе  no
//на основании ответов полины понять, на каких этажах могут храниться ноутбуки
public class task2 {
    static HashMap<Integer, String> floorAnswerMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Этажей в здании: ");
        int floors = (int) (Math.random() * 105) + 1;
        System.out.println(floors);
        int floor = (int) (Math.random() * floors) + 1;
        System.out.println("Ноутбуки на " + floor + " этаже");
        System.out.println("Егор предполагает, где могут быть ноутбуи: ");
        String tryToFind1 = scanner.nextLine();
        System.out.println(checkPolinaAnswer(tryToFind1, floor));
        String tryToFind2 = scanner.nextLine();
        System.out.println(checkPolinaAnswer(tryToFind2, floor));
    }

    public static String checkPolinaAnswer(String tryToFind, int floor) {
        String[] floors = tryToFind.split(" ");
        String florStr = floor +"";
        boolean answer = false;
        for (int i = 0; i < floors.length; i++) {
            if(floors[i].equals(florStr)){
                answer = true;
            }
        }
        if(answer == true) {
            return "Yes";
        }
        return "No";
    }


}
