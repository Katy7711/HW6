public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        int clientAndroid = 1;
        boolean telephone = clientOS > clientAndroid;
        if (telephone) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        char clientIosOrAndroid = 'i';
        int clientDeviceYear = 2222;
        if (clientIosOrAndroid == 'i' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientIosOrAndroid == 'a' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientIosOrAndroid == 'a' && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        int year = 1998;
        int year4 = year % 4;
        int year400 = year % 400;
        int year100 = year % 100;
        if (year4 == 0 && year100 != 0 || year400 == 0)
            System.out.println("Год високосный");
        else {
            System.out.println("Год невисокосный");


        }
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("срок доставки 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("срок доставки 2дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("срок доставки 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("срок доставки больше 3 дней");

        }

       int  monthNumber = 11;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Зима"); }
        else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Весна"); }
        else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Лето"); }
        else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Осень"); }
        else {System.out.println("такого месяца не существует");
        }



    }
}








