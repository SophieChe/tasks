package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//всего в здании n этажей, ноутбуки хранятся на одном из них
//егор прашвает полину, они отвечает yes/no
//егор перечисляет номера этажей, если есть этаж с ноутбуками, полина отвечает yes, иначе  no
//на основании ответов полины понять, на каких этажах могут храниться ноутбуки
public class Map1 {
    static HashMap<Integer, String> floorAnswerMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Этажей в здании: ");
        String floors = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(floors); i++) {
            floorAnswerMap.put(i, "No");
        }
        String neededFloor = scanner.nextLine();
        System.out.println("Ноутбуки на " + neededFloor + " этажах");
        String[] arrayFloors = neededFloor.split(" ");
        for (int i = 0; i < arrayFloors.length; i++) {
            floorAnswerMap.replace(Integer.parseInt(arrayFloors[i]), "Yes");
        }
        String input = "";
        while (!input.equals("HELP")) {
            input = scanner.nextLine();
            if (input.equals("HELP")) {

                for (Map.Entry<Integer, String> floor : floorAnswerMap.entrySet()) {
                    if (floor.getValue().equals("Yes")) {
                        System.out.println(floor.getKey());
                    }
                }
            } else {
                String[] arrayFloor = input.split(" ");
                int check = 0;

                    for (int i = 0; i < arrayFloor.length; i++) {
                        if (!floorAnswerMap.containsKey(Integer.parseInt(arrayFloor[i]))) {
                            System.out.println("No");
                            check++;
                            break;
                        }
                    }
//функция ,которая возвращает список со всеми этажами,где YES,
                //arrayFloor дб полностью равен этажам, которые вернет функция.
                if (check == 0) {
                    System.out.println("Yes");
                }
            }
        }


    }


}
