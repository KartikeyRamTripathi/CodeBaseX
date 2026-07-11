public class ShallowCopy {
    public static void main(String[]args)
    {
        int[] arr = {2,3,4,23,45,89};
        int[] x = arr;
        x[2] = 100;
        System.out.println(arr[2]);
    }
}
