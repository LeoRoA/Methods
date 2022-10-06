import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static boolean checkLeapYear(int checkYear) {
        boolean leapYear = checkYear % 4 == 0 && checkYear % 100 != 0 || checkYear % 400 == 0;
        return leapYear;
    }

    public static void task1() {
        System.out.println("Задание 1:");
        int year = 1704;
        if (checkLeapYear(year)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не является високосный");
        }
    }

    public static void checkVersion(int typeOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (typeOS) {
            case 0:
                if (deviceYear > currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (deviceYear > currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
    }

    public static void task2() {
        System.out.println("Задание 2:");
        int clientOS = 0;
        int clientDeviceYear = 2013;
        checkVersion(clientOS, clientDeviceYear);
    }

    public static void deliveryTimeCalculate(int distance) {
        byte deliveryTime = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance <= 60 && distance > 20) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else {
            if (distance <= 100) {
                System.out.println("Потребуется дней: " + (deliveryTime + 2));
            } else {
                System.out.println("Потребуется обратиться банк в своем регионе");

            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3:");
        int deliveryDistance = 95;
        deliveryTimeCalculate(deliveryDistance);
    }
}


