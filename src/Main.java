public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задание 2");

        int year = 2015;
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0 && clientDeviceYear < year) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= year) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < year) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= year) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");

        int year1 = 2021;
        boolean yearIsValid = year1 >= 1584;
        boolean yearIsLeap = year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0;
        if (yearIsValid && yearIsLeap) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }

        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задание 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Это зима");
                break;
            case 3, 4, 5:
                System.out.println("Это весна");
                break;
            case 6, 7, 8:
                System.out.println("Это лето");
                break;
            case 9, 10, 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Не валидный месяц");

        }
    }
}