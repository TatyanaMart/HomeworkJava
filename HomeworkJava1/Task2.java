// Задача 2. Вывести все простые числа от 1 до 1000.
package HomeworkJava1;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Простые числа от 1 до 1000: ");
        for (int i = 2; i <= 1000; i++) { 
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) { 
                    if (i == j) { 
                        System.out.print(i + " "); 
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }    
}

