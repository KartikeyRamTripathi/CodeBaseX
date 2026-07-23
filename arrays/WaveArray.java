import java.util.Scanner;

public class WaveArray
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of your array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i+=2)
        {
            if(i==arr.length-1)
            {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.print("Wave Array : ");
for (int i = 0; i < arr.length; i++)
{
    System.out.print(arr[i] + " ");
}
    }
}