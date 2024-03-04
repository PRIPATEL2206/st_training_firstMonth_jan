import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int k=3;
        

        for (int i = 0; i <k; i++) {
            for (int j = 0; j < n-1; j++) {
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
            
        }
        System.out.println(Arrays.toString(arr));

    }
}
