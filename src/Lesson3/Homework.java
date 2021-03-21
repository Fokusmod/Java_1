package Lesson3;


import java.util.Random;
import java.util.Scanner;


public class Homework {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        RandomGame();


        RandomeGameWords();
    }

    private static void RandomeGameWords() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String wordAI = words[random.nextInt(25)]; // случайно загаданное слово
        String answer;//ответ пользователя
        char[] chars = new char[15];

        while (true) {
            System.out.println("Угадайте загаданное слово");
            answer = scanner.next();

            if (answer.toLowerCase().equals(wordAI)) {
                System.out.println("Вы угадали!");
                break;
            }
            filling(chars);
            for (int i = 0; i < answer.length() && i < wordAI.length(); i++) {
                if (answer.charAt(i) == wordAI.charAt(i)) chars[i] = wordAI.charAt(i);
            }
            System.out.println("No, you guessed theese letters:");
            System.out.println(new String(chars));
        }
    }


    private static void RandomGame() {
        while (true) {
            int number = random.nextInt(10);
            System.out.println("Введите число от 0 до 9:");
            for (int i = 1; i >= 0; i--) {
                int userNumber = scanner.nextInt();
                if (number == userNumber) {
                    System.out.println("Браво! Вы угадали!");
                    break;
                } else if (i == 0) {
                    System.out.println("К сожалению Вы проиграли");
                } else if (number > userNumber) {
                    System.out.println("Загаданное число больше. У вас осталось " + i + " попытки");
                } else {
                    System.out.println("Загаданное число больше. У вас осталось " + i + " попытки");
                }
            }
            System.out.println("Хотите сыграть еще? Если ДА нажмите 1, если НЕТ 0");
            int user = scanner.nextInt();
            if (user == 0) break;
            if (user == 1) continue;
        }
    }


    static void filling(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = '#';
        }
    }
}













