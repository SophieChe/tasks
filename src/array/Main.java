package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 - 25);// от -25 до 25
        }

        // 1 сумма и произведение элементов массива
        int sum = 0;
        int mult = 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            mult = mult * array[i];
        }
        System.out.println();
        System.out.println("sum = " + sum + " " + "mult = " + mult);

        //2 сумма положительных элементов
        int sumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumPositive = sumPositive + array[i];
            }
        }
        System.out.println("sumPositive = " + sumPositive);

        //3 сумма элементов сачтей массива

        System.out.println("введите номер элемента");
        int k = scanner.nextInt();
        int sumTillK = 0;
        int sumAfterK = 0;
        for (int i = 0; i <= k; i++) {
            sumTillK = sumTillK + array[i];
        }
        for (int i = k + 1; i < array.length; i++) {
            sumAfterK = sumAfterK + array[i];
        }
        if (sumAfterK > sumTillK) {
            System.out.println("sumAfterK > sumTillK");
        } else {
            System.out.println("sumTillK > sumAfterK");
        }
        //4 первый положит эл массива
        int firstPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstPositive = array[i];
                System.out.println("firstPositive = " + firstPositive);
                break;
            }
        }

        //5 поиск максим элемента
        int max = -25;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        //6 максимальный по модулю
        int maxABS = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > maxABS) {
                maxABS = array[i];
            }
        }
        System.out.println("maxABS = " + Math.abs(maxABS));

        //7 два максим элемента
        int max1 = -25;
        int max2 = -25;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max2 && array[i] != max1) {
                max2 = array[i];
            }
        }
        System.out.println("max1 = " + max1 + "  max2 = " + max2);

        // 8 заменить элементы на противоположные
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //9 разделить элементы на максимальный
        int[] array2 = new int[n];
        System.out.print("div 2 =  "); //TODO вывод массива?
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i] / max;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }

        //10 найти разность между макс и мин
        int maxim = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxim) {
                maxim = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("maxim - min = " + (maxim - min));

        //11 поменять местами мин и макс элемент
        int var = 0;
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxim) {
                maxInd = i;
            }
            if (array[i] == min) {
                minInd = i;
            }
        }
        var = array[maxInd];
        array[maxInd] = array[minInd];
        array[minInd] = var;
        System.out.print("поменяли максимальный и мин элементы: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 12 найти количество положитльных элементов массива
        int countSumPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countSumPositive = countSumPositive + 1;
            }
        }
        System.out.println("количество положитльных элементов массива: " + countSumPositive);

        //13 кол-ва отрица и положит элементов

        int countPositiv = 0;
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositiv = countPositiv + 1;
            } else if (array[i] < 0) {
                countNegative = countNegative + 1;
            }
        }
        System.out.println("количество положитльных: " + countPositiv + " и количество отрицательных: " + countNegative);

        //14 вывести элементы массива, которые больше среднего арифметического
        int sumAll = 0;
        for (int i = 0; i < array.length; i++) {
            sumAll = sumAll + array[i];
        }
        int average = sumAll / array.length;
        System.out.print("элементы массива больше среднего арифм " + average + ": ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //15 вывести элементы массива, которые больше предыдущего
        System.out.print("вывести элементы массива, которые больше предыдущего: ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //16 определить индексы элементов массива, значение которых лежит в указанном пределе
        int start = (int) (Math.random() * 2 + 5); // от 5 до 7
        int end = (int) (Math.random() * 10 + 15); // от 15 до 25
        System.out.print("индексы элементов массива, значение которых лежит в диапазоне от " + start + " до " + end + ": ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > start && array[i] < end) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //17 самая длинная последовательность, состоящая из одинвковых элементов
//        int countLength = 0;
//        for (int i = 0; i < array.length; i++) {
//
//        }

        //18 есть ли в массиве одинвковые элементы?
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("одинаковые элементы есть: " + array[i] + " и " + array[j]);
                }
                break;
            }
        }
        System.out.println("Одинаковых элементов нет"); //TODO куда поставить вывод ,если повторов нет

        //19 вставка элемента в массив
        int[] arrayW = new int[n + 1];
        for (int i = 0; i < arrayW.length - 1; i++) {
            arrayW[i] = (int) (Math.random() * 50 - 25);// от -25 до 25
            System.out.print(arrayW[i] + " ");
        }
        System.out.println();
        System.out.println("ввести номер индекса,куда добавить элемент: ");
        int ind = scanner.nextInt();
        for (int i = arrayW.length - 1; i >= ind; i--) {
            arrayW[i] = arrayW[i - 1];
        }
        System.out.println("ввести значение индекса добавляемого элемента: ");
        int indNew = scanner.nextInt();
        arrayW[ind] = indNew;
        for (int i = 0; i < arrayW.length; i++) {
            System.out.print(arrayW[i] + " ");
        }
        System.out.println();

        //20 удаление элементов одномерного массива
//        System.out.println("удалить все элементы, значение которых больше 5");
//        int countE = 0;
//        for (int i = 0; i < arrayW.length; i++) {
//            if (arrayW[i] > 5) {
//                countE = countE +1;
//            }
//        }
//
//        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arrayW));
//        list.removeAll(Arrays.asList("a"));
//        array = list.toArray(array);
//
//        for (int i = 0; i < arrayNew.length; i++) {
//            System.out.print(arrayNew[i] + " ");
//        }


        //21 удалить повторяющиеся элементы

        //22 слияние 2 упорядоченных масивов


        //23 сортировка выбором

        //24 сортировка методом пузырька

        //25 вывести в порядке возрастания цифры, из которых состоит число

        //26 номер дня с начала года
    }
}