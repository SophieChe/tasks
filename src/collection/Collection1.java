package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1 {

    public static void main(String[] args) {
        //создать 2 списка , будут лежать массивы ФИО , а ФИО  - это массив из 3 строк
        // заполнить лист рандомным фио
        //вывести одинаковые ФИО из 2 списков

        List<String[]> listN = new ArrayList<>();
        List<String[]> listM = new ArrayList<>();

        fillList(listN);
        fillList(listM);

        // to check
        for (String[] elementN: listN) {
            System.out.println("проверка listN"+Arrays.toString(elementN));
        }
        System.out.println();

        for (String[] elementM: listM) {
            System.out.println("проверка listM"+Arrays.toString(elementM));
        }
        System.out.println();

        for (String[] elementN: listN) {
            for (String[] elementM: listM) {
                if(Arrays.equals(elementN, elementM)){
                    System.out.println(Arrays.toString(elementN));
                }
            }
        }
    }


    public static void fillList(List<String[]> listN) {
        for (int i = 0; i < 5; i++) {
            listN.add(creatFIO());
        }
    }


    public static String[] creatFIO() {
        String[] FIO = new String[3];
        FIO[0] = createLastname();
        FIO[1] = createName();
        FIO[2] = createSecondName();
        return FIO;
    }

    public static String createName() {
        List<String> listOfName = new ArrayList<>();
        listOfName.add("Сергей");
        listOfName.add("Михаил");
        listOfName.add("Дмитрий");
        listOfName.add("Евгений");
        listOfName.add("Андрей");
        listOfName.add("Александр");

        return listOfName.get((int) (Math.random() * listOfName.size()));
    }

    public static String createLastname() {
        List<String> listOfLastname = new ArrayList<>();
        listOfLastname.add("Кольцов");
        listOfLastname.add("Иванов");
        listOfLastname.add("Петров");
        listOfLastname.add("Менделеев");
        listOfLastname.add("Тургенев");
        listOfLastname.add("Бунин");

        return listOfLastname.get((int) (Math.random() * listOfLastname.size()));
    }

    public static String createSecondName() {
        List<String> listOfSecondname = new ArrayList<>();
        listOfSecondname.add("Игоревич");
        listOfSecondname.add("Андреевич");
        listOfSecondname.add("Александрович");
        listOfSecondname.add("Романович");
        listOfSecondname.add("Владимирович");
        listOfSecondname.add("Павлович");
        return listOfSecondname.get((int) (Math.random() * listOfSecondname.size()));
    }
}
