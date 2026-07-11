import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the number to search : ");
        int num = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;   
        int i;

        System.out.print("Enter the elements of array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (arr[i] == num) {
                flag = true;
                System.out.println(num + " found at index " + i);
            }
        }
        if (flag == false) {
            System.out.println("Not found");
        }
    }
}