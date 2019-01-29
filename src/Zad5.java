import java.util.Random;

public class Zad5 {
    public static void main(String[] args) {
        int[] table = new int[10];
        Random random = new Random();
        for(int i = 0; i < table.length; i++){
            table[i] = random.nextInt(100);
        }

        double sum = 0;
        for(int j = 0; j < table.length; j++){
            sum = sum + table[j];
        }


        double average = sum / table.length;
        int sumBelow = 0;
        for(int k = 0; k < table.length; k++){
            if (table[k] < average){
                sumBelow = sumBelow + table[k];
            }
        }

        int sumAbove = 0;
        for(int h = 0; h < table.length; h++){
            if (table[h] > average){
                sumAbove = sumAbove + table[h];
            }
        }
        System.out.println("Average: " + average);
        System.out.println("Sum Below: " + sumBelow);
        System.out.println("Sum Above: " + sumAbove);


    }
}
