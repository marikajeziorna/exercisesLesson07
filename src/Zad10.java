import java.util.Arrays;
import java.util.Random;

public class Zad10 {
    public static void main(String[] args) {
        Zad10 problem = new Zad10();
        int[] tab = problem.generateArray();
        int[] uniqueElements = problem.getUniqueElements(tab);
        System.out.println(Arrays.toString(uniqueElements));
    }

    private int[] generateArray() {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    private int[] getUniqueElements(int[] array) {
        int[] unique = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(!checkIfContains(array[i], unique)) {
                unique[i] = array[i];
            }
        }
        return unique;
    }

    private boolean checkIfContains(int number, int[] array) {
        boolean contains = false;
        int i = 0;

        while(!contains && i < array.length) {
            if(array[i] == number) {
                contains = true;
            }
            i++;
        }
        return contains;
    }
}