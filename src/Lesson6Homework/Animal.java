package Lesson6Homework;



public class Animal {
   private String name;
   private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void run (int leng) {
        System.out.println(name + " Пробежал " + leng + "метров");
    }

    public void sail (int leng) {
        System.out.println(name + " Проплыл " + leng + "метров");
    }

    public String getName() {
        return name;
    }


}



