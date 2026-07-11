import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Target: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        int i, j;
        boolean found = false;

        System.out.print("Enter the elements of array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    System.out.println(arr[i] + " and " + arr[j] + " sum up to " + target);
                }
            }
        }

        if (found == false) {
            System.out.println("Target not found");
        }
    }//Array practice program
}
