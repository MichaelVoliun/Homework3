import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       //Задание 1 + Задание 2

        int clientOS = 1; //Задаем значение переменной, где 0 - iOS, 1 -Android
        int clientDeviceYear = 2013; //Значение до 2015 - облегченная версия

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задание 3

        int year = 2020;

        if (year % 4 == 0 && year % 100 !=0) {
            System.out.println(year + " - является високосным годом");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400== 0) {
            System.out.println(year + " - является високосным годом");
        }
        else {
            System.out.println(year + " - не является високосным");
        }

        //Задание 4

        int deliveryDistance = 95;
        int interval1 = 20; //Первоначальный интервал - 1 день
        int interval2 = 40; //Интервал, увеличивающий срок доставки на 1 день

        if (deliveryDistance <= 20) {
            System.out.println("Доставка зайтем 1 сутки");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= interval1 + interval2) {
            System.out.println("Доставка займет 2 суток");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= interval1 + interval2*2) {
            System.out.println("Доставка займет 3 суток");
        }




        //Задание 5

        int monthNumber = 11;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует ");

        }


            }
        }

