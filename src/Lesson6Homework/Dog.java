package Lesson6Homework;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, String color) {
        super(name, color);
        count++;

    }

    @Override
    public void run(int leng) {
        if (leng <= 500)
            System.out.println("Собака " + getName() + " пробежала " + leng);
        else {
            int i = leng - 500;
            System.out.println("Собака " + getName() + " пробежала " + leng + " метров и устала. Оставшиеся " + i + " метров она не хочет бежать.");
        }
    }

    @Override
    public void sail(int leng) {
        if (leng <= 10)
            System.out.println("Пёс " + getName() + " Проплыл " + leng + " метров.");
        else {
            System.out.println("Пёс " + getName() + " проплыл 10 метров и повернул к берегу.");
        }
    }

    public static void count  (){
        System.out.println("Количество собак - " + count);
    }


}


