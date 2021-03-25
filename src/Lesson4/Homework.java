package Lesson4;


import java.util.Random;
import java.util.Scanner;


public class Homework {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';

    private static char[][] field;
    private static int fieldSizeY;
    private static int fieldSizeX;


    public static void main(String[] args) {
        fieldSizeY = 3;
        fieldSizeX = 3;


        while (true) {
            System.out.println("Сыграем в игру крестики-нолики");
            fieldInit();
            printField();
            while (true) {
                humanTurn();
                printField();

                if (checkToWin(DOT_HUMAN)) {
                    System.out.println("Вы выиграли! Поздравляю!");
                    break;
                }
                AiTurn();
                printField();
                if (checkToWin(DOT_AI)) {
                    System.out.println("Вы проиграли....!");
                    break;
                }
                if (checkDrow()) System.out.println("Ничья");
            }
            System.out.println("Хотите сыграть еще раз? Введите  Y или N >>>>");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
    }


    private static boolean checkToWin(char c) {
        for (int i = 0; i < 3; i++)
            if ((field[i][0] == c && field[i][1] == c &&
                    field[i][2] == c) ||
                    (field[0][i] == c && field[1][i] == c &&
                            field[2][i] == c))
                return true;
        if ((field[0][0] == c && field[1][1] == c &&
                field[2][2] == c) ||
                (field[2][0] == c && field[1][1] == c &&
                        field[0][2] == c))
            return true;
        return false;
    }

    private static boolean checkDrow() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkEmpty(y, x)) return false;
            }
        }
        return true;
    }

    private static boolean checkEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean checkValid(int y, int x) {
        return y >= 0 && x >= 0 && y < fieldSizeY && x < fieldSizeX;


    }

    private static void AiTurn() {
        int y, x;
        System.out.println("\nХод компьютера!>>>");
        do {
            y = RANDOM.nextInt(fieldSizeY);
            x = RANDOM.nextInt(fieldSizeX);
        } while (!checkEmpty(y, x));
        field[y][x] = DOT_AI;

    }

    private static void humanTurn() {
        int y, x;
        do {
            System.out.print("\nВаш ход! Введите координаты y и x >>>>");
            y = SCANNER.nextInt() - 1;
            x = SCANNER.nextInt() - 1;
        } while (!checkValid(y, x) || !checkEmpty(y, x));
        field[y][x] = DOT_HUMAN;

    }

    private static void printField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " ");
            }
            System.out.println();
        }
    }

    private static void fieldInit() {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }

        }
    }
}
