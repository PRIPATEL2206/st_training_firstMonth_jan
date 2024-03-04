import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,4,5,6,6,7,8,9};
        int duplicates[]=new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                duplicates[count]=arr[i];
                count++;
            }
        }
        for (int i = 0; i < duplicates.length; i++) {
            arr[i]=duplicates[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
