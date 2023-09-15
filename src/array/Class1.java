package array;

import java.util.Scanner;

public class Class1 {
    //17 самая длинная последовательность, состоящая из одинвковых элем

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);// от -25 до 25
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int count = 1;
        int maxCounter = 1;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]){
                count++;
            } else if(count > maxCounter) {
                maxCounter = count;
                count = 1;
            }
        }
        System.out.println(maxCounter);
    }
}



//
//        listOfLastname.add("Есенин");
//        listOfLastname.add("Блок");
//        listOfLastname.add("Ахматов");
//        listOfLastname.add("Цветаев");
//        listOfLastname.add("Асадов");
//        listOfLastname.add("Пушкин");
//        listOfLastname.add("Куприн");

//        listOfSecondname.add("Андреевич");
//        listOfSecondname.add("Александрович");
//        listOfSecondname.add("Романович");
//        listOfSecondname.add("Владимирович");
//        listOfSecondname.add("Павлович");
//        listOfSecondname.add("Николаевич");
//        listOfSecondname.add("Игоревич");

//       for (int j = 0; j < listM.size(); j++) {
//        if (listN.contains(listM.get(j))) {
//        System.out.println("из списка N " + listN.get(j).toString());
//
//        }
//        }