import java.util.Arrays;
import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        while (a < 1 || a > 20){
            System.out.println("Enter a number 'a' between [1; 20]");
            a = scanner.nextInt();
        }

        for (int i = 0; i < a; i++){
            int[] tree = new int[i * 2 + 1];
            String[] margin = new String[a - i];
            String level = "";

            for (int j = 0; j < margin.length; j++){
                level = level + " ";
            }

            for (int j = 0; j < tree.length; j++){
                level = level + "0";
            }
            System.out.println(level);
        }
    }
}
