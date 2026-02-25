public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkLimitNumbers(5, 9);
        checkNumberType(-5);
        checkNumberTypeLogical(8);
        wordQuantity("Природа", 8);
        leapYear(2026);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a, b;
        a = 5;
        b = 7;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 16;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 56;
        int b = 18;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void checkLimitNumbers(int a, int b) {
        boolean flag = (a + b >= 10) && (a + b <= 20);
        System.out.println(flag);

    }

    private static void checkNumberType(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static void checkNumberTypeLogical(int a) {
        boolean flag = a < 0;
        System.out.println(flag);
    }

    private static void wordQuantity(String word, int quantity) {
        while (quantity != 0) {
            System.out.println(word);
            quantity--;
        }
    }

    private static void leapYear(int year) {
        boolean flag = (year % 4 == 0) || (year % 400 == 0 && year % 100 != 0);
        System.out.println(flag);
    }

}
