import java.util.Scanner;
 class ArrayTransformation
{
    public static void main(String[]args)
    {
      Scanner in = new Scanner(System.in);
      int[] arr = new int[6];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=in.nextInt();

      }
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
       for(int i=0;i<arr.length;i++)
       {
        if(i%2==0)
        {
         System.out.print((arr[i]+10)+" ");
        }
         else
        {
         System.out.print((arr[i]*2)+" ");
        }
       }
    }
}