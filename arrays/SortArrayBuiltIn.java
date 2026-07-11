import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16,-2,99,-2,5,1,11,-1,-9,192};
        print(arr);
        Arrays.sort(arr); 
        print(arr);

    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
}
