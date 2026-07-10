import java.util.Scanner;
public class AlternateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Alternate elements (starting from index 0) : ");
        for (int i = 0; i < n; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}