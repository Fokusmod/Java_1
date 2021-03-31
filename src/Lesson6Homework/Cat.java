package Lesson6Homework;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int leng) {
        if (leng <= 200)
        System.out.println("Кошка " + getName() + " Пробежала " + leng + "метров.");
        else {
            int i = leng - 200;
            System.out.println("Кошка " + getName() + " Пробежала 200 метров и устала. Оставшиеся " + i +" метров она не хочет бежать.");
        }
    }

    @Override
    public void sail (int leng) {
        System.out.println("Кошки и коты не умеют плавать.");
    }

    public void song (){
        System.out.println("Meow...Meow...Meow...");
    }
}


