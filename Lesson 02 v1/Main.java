import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество рублей");
        int text = sc.nextInt();
        double d1 = (double) text % 100.0;
        int d2 = (int) d1 / 10;
        double d3 = d1 % 10;

        if (d3 >= 2 && d3<=4 && (d2 > 1 || d2 == 0)){
            System.out.println(text + " рубля");
        } else if(d3 == 1 && (d2 > 1 || d2 == 0)){
            System.out.println(text + " рубль");
        } else {
            System.out.println(text + " рублей");
        }

    }
}
