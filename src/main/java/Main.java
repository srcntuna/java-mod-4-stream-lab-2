import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        System.out.println(maxAbsoluteVal(input));
    }

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsoluteVal(String[] numbers) {

        Stream<String> numbersList = Arrays.stream(numbers);

        return numbersList.mapToInt(str -> Integer.parseInt(str)).map(num->Math.abs(num)).max().getAsInt();

    }
}
