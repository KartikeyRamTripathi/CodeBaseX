// BY REFERENCE 

public class PassingArrayToMethod {
    public static void main(String[]args)
   {
    int[] x = {4,5,2,6,2,7,9};
    System.out.println(x[2]);
    change(x);
    System.out.println(x[2]);
   }
   public static void change(int[] y)
   {
    y[2] = 99 ;
    
   }
    
}


