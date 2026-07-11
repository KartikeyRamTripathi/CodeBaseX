import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print("Enter a Number : ");
      if(n%2==0)
      {
        System.out.println("Entered Number is even");
      }
      else 
      {
        System.out.println("Entered Number is odd");
      }
    }
    
}
