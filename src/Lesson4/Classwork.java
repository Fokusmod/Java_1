package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Classwork {
    private static final Random RANDOM = new Random(); // рандомное значение, почему оно константное не понятно
    private static final Scanner SCANNER = new Scanner(System.in); //константный сканнер
    private static final char DOT_HUMAN = 'X'; // ход игрока
    private static final char DOT_AI = 'O'; // ход компьютера
    private static final char DOT_EMPTY = '_'; // пустые ячейки

    private static char[][] field; // игровое поле
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static String playerOneName = "";

    private static int scoreHuman = 0;
    private static int scoreAI = 0;


    public static void main(String[] args) {
        fieldSizeY = 3;
        fieldSizeX = 3;
        while (true) {
            System.out.print("Представьтесь пожалуйста>>>>>");
            playerOneName = SCANNER.nextLine();
            initField();
            printField();

            while (true) {

                humanTurn();
                printField();
                if (gameCheck(DOT_HUMAN,  String.format("%s, sы выиграли! Победа!", playerOneName))) break;
                aiTurn();
                printField();
                if (gameCheck(DOT_AI, "Компьютер победил!"))
                break;
            } // %s = string %d - int , %f float %c char %b boolean
            System.out.printf("Игровой счёт:\n%s: %d || AI: %d\n", playerOneName, scoreHuman, scoreAI);
            System.out.println("Хотите сыграть еще? >>>> Y or N >>>>");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
    }


    private static boolean gameCheck(char dot, String s) {
        if (checkWin(dot)) {
            if (dot == DOT_HUMAN) {
                scoreHuman++;
            } else scoreAI++;

            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char c) {
        if (field[0][0] == c & field[0][1] == c && field[0][2] == c) return true;// horiz
        if (field[1][0] == c & field[1][1] == c && field[1][2] == c) return true;// horiz
        if (field[2][0] == c & field[2][1] == c && field[2][2] == c) return true;// horiz

        if (field[0][0] == c & field[1][0] == c && field[2][0] == c) return true;// wertic
        if (field[0][1] == c & field[1][1] == c && field[2][1] == c) return true;// wertic
        if (field[0][2] == c & field[1][2] == c && field[2][2] == c) return true;// wertic

        if (field[0][0] == c & field[1][1] == c && field[2][2] == c) return true;// wertic
        if (field[0][2] == c & field[1][1] == c && field[2][0] == c) return true;
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y)) return false;

            }
        }
        return true;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.printf("%s ведите координаты y и x через пробел >>>>>", playerOneName);
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[x][y] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }


    private static boolean isCellValid(int x, int y) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField() {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

