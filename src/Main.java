    public class Main {
        public static void main(String[] args) {
            // Задача 1 по теме методы
           int year = 2000;
            printMessage(year);
           // printLink(0, 2015);
            printDeliveryDays( 70 );
        }

        public static void printMessage(int year) {
            // Метод отыечающий за ввывод сообщения
            if (isYearLeep(year)) {
                System.out.println(year + " Год являеться високоным ");
            } else
                System.out.println(year + " Год является невисокосным");
        }

        public static boolean isYearLeep(int year) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            // Метод который отвечает за проверку всех условий задачи
        }

        // Задача 2 по теме методы
        private static void printLink(int os, int year) {
            if (os == 0) {
                if (year >= 2015) {
                    System.out.println(" Установите облегченную версию приложения для Ios по ссылке ");
                } else {
                    System.out.println(" Установите версию приложения для Ios по ссылке");
                }
            } else {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке");
                if (year >= 2015) {
                } else {
                    System.out.println(" Установите версию приложения для Android по ссылке ");
                }
            }
        }

        private static int printDeliveryDays(int distance) {
            int deliveryDay = calcalateDeliveryDay(distance);
            if (deliveryDay < 0) {
                System.out.println(" Доствка не осуществляеться ");
            } else {
                System.out.println(" Достака займет " + deliveryDay + " Дней ");
            }
            return deliveryDay;
        }
        private static int calcalateDeliveryDay(int distance) {
            if (20 > distance) {
                return 1;
            } else if (60 > distance) {
                return 2;
            } else if (100 > distance) {
                return 3;
            } else {
                return-1;
            }
        }
    }


