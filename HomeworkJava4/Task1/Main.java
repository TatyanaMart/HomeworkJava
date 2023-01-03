package HomeworkJava4.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Список: " + list);

        List<Integer> reverse = reverseList(list);
        System.out.println("Перевернутый список: " + reverse);
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
    
}
