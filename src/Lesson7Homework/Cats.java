package Lesson7Homework;


public class Cats {
    private String name;
    private int appepite;
    private boolean satiety;

    public Cats(String name, int apepite, boolean satiety) {
        this.name = name;
        this.appepite = apepite;
        this.satiety = satiety;
    }

    public void eat(Bowl bowl) {
        if (satiety ==true) {
            System.out.println("Кот " + this.name + " уже поел");
        }
        else if (bowl.getFoodAmount() > appepite) {
            bowl.decreaseFood(appepite);
            this.satiety = true;
            System.out.println("Кот " + this.name + " сьел " + appepite + " единиц еды и наелся." + satiety);
            System.out.println("В миске осталось " + bowl.getFoodAmount() + " единицы еды.");
        }
        else System.out.println("В миске мало еды. Кот " + this.name + " не поел. " + satiety);

        System.out.println();
    }
}
