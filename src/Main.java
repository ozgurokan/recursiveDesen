import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();
        recursiveMethod(number);
    }

    public static void recursiveMethod(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        recursiveMethod(n - 5);
        System.out.print(n + " ");
    }
}
