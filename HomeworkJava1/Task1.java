// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HomeworkJava1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 1;
        int number = 0;
        System.out.print("Введите число: ");
        int n = in.nextInt();
        for (int i = 1; i < n + 1; i++) {
            number = i * (i + 1) / 2;
        }
        System.out.println("Треугольное число равно: " + number);

        for (int i = 1; i < n + 1; i++) {
            res = res * i;
        }
        System.out.println("Факториал равен: " + res);
        in.close();
    }
}