package com.tasks.lesson5;

public class Task4 {
    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("Понедельник");
                break;
            case "2":
                System.out.println("Вторник");
                break;
            case "3":
                System.out.println("Среда");
                break;
            case "4":
                System.out.println("Четверг");
                break;
            case "5":
                System.out.println("Пятница");
                break;
            case "6", "7":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Error");
        }
    }
}
