import java.util.Scanner ;
public class InputOutputArray
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data of array : ");
        int[] Karan = new int[7];
        for(int i=0;i<7;i++)
        {
            Karan[i] = sc.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            System.out.print(Karan[i]+" ");
        }

    }
}