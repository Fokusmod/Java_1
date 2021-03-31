package Lesson6Homework;


public  class Animal {
    private String name;
    private String color;
    private static int count;


    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        count++;


    }

    public void run(int leng) {
        System.out.println(name + " Пробежал " + leng + "метров");
    }

    public void sail(int leng) {
        System.out.println(name + " Проплыл " + leng + "метров");
    }

    public String getName() {
        return name;
    }

    public static void count  (){
        System.out.println("Количество животных - " + count);
    }

}



