import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1;

        while (a < 0 || a > 100){
            System.out.println("Enter a number 'a' between [0; 100]");
            a = scanner.nextInt();
        }
        if( a % 3 == 0 && a % 5 == 0){
            System.out.println("Value 'a': " + a + ", \n text: FizzBuzz");
        }else if(a % 3 == 0){
            System.out.println("Value 'a': " + a + ", \n text: Fizz");
        }else if (a % 5 == 0){
            System.out.println("Value 'a': " + a + ", \n text: Buzz");
        }
    }
}
