import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Arrays.setAll(numbers, i -> (i+1));

        for (int j : numbers) {
            if (j%3 == 0 && j%5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (j%3 == 0) {
                System.out.print("Fizz, ");
            } else if (j%5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(j+", ");
            }
        }

        System.out.println();

    }
}
