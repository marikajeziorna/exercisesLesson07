import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        printBlock();
    }

    public static void printBlock() {

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        x = scanner.nextInt();

        while (x * x < 100) {
            sum += x;
            x = scanner.nextInt();
        }
        sum = sum % 2;
        System.out.println(sum);
    }
}
