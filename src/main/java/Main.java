import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{5, 0, 1, 3, 2};
        System.out.println(findMissingNumber(numbers1));

        int[] numbers2 = new int[]{7, 9, 10, 11, 12};
        System.out.println(findMissingNumber(numbers2));
    }

    public static int findMissingNumber(int[] numbers) {
        // if array is null, empty or has only one member
        if (numbers == null) {
            System.out.println("Array is null");
            return -1;
        }

        int numbersCount = numbers.length;
        if (numbersCount == 1 || numbersCount == 0) {
            System.out.println("There is no missing number");
            return -1;
        }

        int minNumber = Arrays.stream(numbers).min().getAsInt();
        int maxNumber = Arrays.stream(numbers).max().getAsInt();

        // if more than one element is missing
        if (maxNumber - numbersCount > minNumber) {
            System.out.println("There are too many missing numbers");
            return -1;
        }

        // if no element is missing
        if (maxNumber - numbersCount < minNumber) {
            System.out.println("There is no missing number");
            return -1;
        }

        // missing element is equal to the difference between expectedSum and actualSum
        int expectedSum = (minNumber + maxNumber) * (maxNumber - minNumber + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
