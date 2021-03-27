package Lesson5Homework;

public class soWorker {
    String fio;
    String position;
    String eMail;
    int phoneNumber;
    int salary;
    int age;

    public soWorker(String fio, String position, String eMail, int phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }


    public void printInfo() {
        System.out.println("\nФИО: " + fio + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }


}