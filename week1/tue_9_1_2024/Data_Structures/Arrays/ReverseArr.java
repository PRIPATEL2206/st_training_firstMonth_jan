import java.util.Arrays;
class ReverseArr{
    public static void main (String[] ars){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}