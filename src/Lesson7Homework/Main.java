package Lesson7Homework;

public class Main {
    public static void main(String[] args) {

        Cats[] c = {
                new Cats("Мурка", 20,false),
                new Cats("Барсик", 15,false),
                new Cats("Коржик", 3,false),
                new Cats("Баламут", 10,false),
                new Cats("Шарик", 7,false),
                new Cats("Гена", 23,false)
        };

        Bowl bowl = new Bowl();
        bowl.putFood(50);
        for (Cats cats : c) {
            cats.eat(bowl);

        }

        bowl.putFood(50);
        for (Cats cats : c) {
            cats.eat(bowl);
        }
    }
}
