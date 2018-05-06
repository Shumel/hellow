import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
