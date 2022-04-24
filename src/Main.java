public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задание №1");
        int clientOS = 0;
        int clientAD = 1;
        if (clientOS < clientAD) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {System.out.println("Установите версию приложения для Android по ссылке");}
        System.out.println("********************************");
        System.out.println("Задание №2");
        int OS = 2016;
        int AD = 2013;
        int clientDeviceYear = 2015;
        if (OS >= clientDeviceYear) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        if (AD >= clientDeviceYear) {System.out.println("Установите версию приложения для Android по ссылке");}
        else {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        System.out.println("********************************");
        System.out.println("Задание №3");
        int Year = 2022;
        if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println(Year + "является высокосным");}
        else {
            System.out.println(Year + " не является высокосным");
        }
        System.out.println("********************************");
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {System.out.println("Потребуется дней: 1");}
        if (deliveryDistance <= 60) {System.out.println("Потребуется дней: 2");}
        else  {System.out.println("Потребуется дней: 3");}
        System.out.println("********************************");
        System.out.println("Задание №5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь : Зима");
                break;
            case 2:
                System.out.println("Февраль: Зима");
                break;
            case 3:
                System.out.println("Марь: Весна");
                break;
            case 4:
                System.out.println("Апрель: Весна");
                break;
            case 5:
                System.out.println("Май: Весна");
                break;
            case 6:
                System.out.println("Июнь: Лето");
                break;
            case 7:
                System.out.println("Июль: Лето");
                break;
            case 8:
                System.out.println("Август: Лето");
                break;
            case 9:
                System.out.println("Сентябрь: Осень");
                break;
            case 10:
                System.out.println("Октябрь: Осень");
                break;
            case 11:
                System.out.println("Ноябрь: Осень");
                break;
            case 12:
                System.out.println("Декарь: Зима");
                break;
            default:
                System.out.println("Номер месяца больше 13");
        }


    }
}