public class Main {

    public static void main(String[] args) {

        System.out.println("task 1___________________________________________________________________________________");
        int operatingSystem = 1;

        if (operatingSystem  == 1) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else if (operatingSystem  == 0) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else {
            System.out.println("Данная система не подерживается");
        }

        System.out.println("\ntask 2___________________________________________________________________________________");
        int deviceYevice = 2015;

        if (operatingSystem  == 0 && deviceYevice  == 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (operatingSystem  == 0 ) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (operatingSystem  == 1 && deviceYevice  < 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        } else if (operatingSystem  == 1 && deviceYevice  >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }

        System.out.println("\ntask 3___________________________________________________________________________________");
        int year = 2024;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("« %s год является високосным»", year);
        } else {
            System.out.printf("« %s год не является високосным».", year);
        }

        System.out.println("\ntask 4___________________________________________________________________________________");
        int deliveryDistance =95;
        int days = 1;

        if (deliveryDistance <= 20) {
            System.out.printf("Пoтpeбуется дней:" + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = days + 1;
            System.out.println("Пoтpeбуется дней: " + days);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = days +=2;
            System.out.println("Пoтpe6yeтcя дней: " + days);

        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("\ntask 5___________________________________________________________________________________");

        int monthNumber = 13;

        switch (monthNumber) {
            case 12, 1, 2:
                System.out.printf("Зима");
                break;
            case 3, 4, 5:
                System.out.printf("Весна");
                break;
            case 6, 7, 8:
                System.out.printf("Лето");
                break;
            case 9, 10, 11:
                System.out.printf("Осень");
                break;
            default:
                System.out.printf("Данного времени года не существует, ошибка");



        }


    }
}

