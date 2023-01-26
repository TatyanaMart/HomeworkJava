package HW_OOP2;

// Описать неизменяемый класс (Неизменяемость должна сохранятся при любых обстоятельствах)

public class Main {
    public static void main(String[] args) {
        Parrot myParrot = new Parrot("Кеша", "белый", "какаду");
        myParrot.sayInfo();
    }
}
