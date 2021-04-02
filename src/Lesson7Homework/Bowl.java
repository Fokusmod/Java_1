package Lesson7Homework;

public class Bowl {
    private int foodAmount;



    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.println("\nВ миску положили " + amount + " единиц еды. Всего в миске " + foodAmount + " единицы еды.");
        System.out.println();
    }

    public void decreaseFood(int amount) {
        this.foodAmount -=amount;
    }

    public void foodAmountInfo (){
        System.out.println(foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}