import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1(sc);
        task2(sc);
        task3(sc);
        task4(sc);
        sc.close();
    }


    public static void task1(Scanner sc){
        System.out.println("Введите первое слово");
        String text = sc.next();
        System.out.println("Введите второе слово");
        String text2 = sc.next();
        if (text.equals(text2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (text.equalsIgnoreCase(text2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (text.length() == text2.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
    public static void task2(Scanner sc){
        System.out.println("Введите колличество рублей");
        int text = sc.nextInt();
        double d1 = (double) text % 100.0;
        int d2 = (int) d1 / 10;
        int d3 = (int) d1 % 10;
        if (d2 == 1){
            d3 += 10;
        }
        switch (d3) {
            case 1:
                System.out.println(text + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(text + " рубля");
                break;
            default:
                System.out.println(text + " рублей");
        }
    }

    public static void task3(Scanner sc) {
        System.out.println("Введите колличество рублей");
        int text = sc.nextInt();
        double d1 = (double) text % 100.0;
        int d2 = (int) d1 / 10;
        int d3 = (int) d1 % 10;
        if (d2 == 1){
            d3 += 10;
        }
        switch (d3) {
            case 1:
                System.out.println(text + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(text + " рубля");
                break;
            default:
                System.out.println(text + " рублей");
        }
    }

    public static void task4 (Scanner sc){
        System.out.println("Введите год");
        int text = sc.nextInt();
        if (text % 4 == 0) {
            if (text % 100 != 0 || text % 400 == 0) {
                System.out.println("високосный");
            } else {
                System.out.println("не високосный");
            }
        } else {
            System.out.println("не високосный");
        }
    }
}
