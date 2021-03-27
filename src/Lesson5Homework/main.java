package Lesson5Homework;


public class main {
    public static void main(String[] args) {
        soWorker[] workers = new soWorker[5];
        workers[0] = new soWorker("Латышев Константин", "Разработчик Java", "LatishevKostya@mail.ru", 54_55_56, 100_000, 25);
        workers[1] = new soWorker("Василий Пупкин", "Разработчик Python", "VasyaPupkin@mail.ru", 4_5_6, 112_000, 45);
        workers[2] = new soWorker("Пупок Васькин", "Шахтер", "Pupok228@mail.ru", 34_57_6, 40_000, 47);
        workers[3] = new soWorker("Парень в Кепке", "Продавец", "ParnishaCool@mail.ru", 24_525_5, 70_000, 35);
        workers[4] = new soWorker("Владимир Путин", "Политик", "LiderAndBorec@mail.ru", 11_11_11, 100_000_000, 60);


        Print40(workers);

    }

    private static void Print40(soWorker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age >= 40)
                workers[i].printInfo();
        }
    }
}
