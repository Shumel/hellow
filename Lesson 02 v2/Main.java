import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
}
