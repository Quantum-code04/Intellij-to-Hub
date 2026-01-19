import java.util.Scanner;

public class OddNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Odd numbers index:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
