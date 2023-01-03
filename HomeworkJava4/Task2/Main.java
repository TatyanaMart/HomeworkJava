package HomeworkJava4.Task2;

/*Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("Заданная очередь: " + stack.getList());
        System.out.println("Добавлен элемент " + stack.value + " в конец очереди: " + stack.enqueue(stack.value));
        System.out.println("Первый элемент " + stack.dequeue(MyStack.list) + " удален из очереди: " + MyStack.list);
        System.out.println("Первый элемент " + stack.first(MyStack.list) + " не удален из очереди: " + MyStack.list);
    }
}
