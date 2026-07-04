import java.util.Scanner;

public class ReverseAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        int k = n;
        int r = 0;

        while (k != 0) {
            r *= 10;
            r += (k % 10);
            k /= 10;
        }

        System.out.println("Reverse of The Number : " + r);
        System.out.println("Their Sum : " + (r + n));

        sc.close();
    }
}