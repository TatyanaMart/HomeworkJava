package HW_OOP2;

public final class Parrot {
    private final String name;
    private final String color;
    private final String breed;

    public Parrot(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    public void sayInfo() {
        System.out.printf("Попугая зовут %s, окрас %s, порода %s", this.name, this.color, this.breed);
    }
}
