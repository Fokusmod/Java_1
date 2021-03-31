package Lesson6Homework;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("Мурка", "Рыжая");
        Animal animal2 = new Cat("Сильва", "Русая");
        Animal animal3 = new Dog("Барон", "Чёрный");
        Animal animal4 = new Dog("Лорд", "Чёрно-рыжый");


        animal.run(500);
        animal3.sail(10);
        animal4.sail(200);
        animal2.run(1500);
        animal.sail(150);
        System.out.println();
        ((Cat) animal2).song();

Animal.count();
Cat.count();
Dog.count();




    }


}



//
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.