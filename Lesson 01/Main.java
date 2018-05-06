import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String text = sc.next();
        System.out.println("Введите второе слово");
        String text2 = sc.next();
        sc.close();
        if (text.equals(text2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (text.equalsIgnoreCase(text2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (text.length() == text2.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}



