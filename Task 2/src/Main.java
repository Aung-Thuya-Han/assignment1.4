import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int maximumSum = numbers[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int start = 0; start < numbers.length; start++) {
            int sum = 0;

            for (int end = start; end < numbers.length; end++) {
                sum = sum + numbers[end];

                if (sum > maximumSum) {
                    maximumSum = sum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }

        System.out.println("Maximum sum: " + maximumSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));
    }
}
