import java.util.Arrays;
class ComunElements{
    public static void main(String [] args){
        int [] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,5,10,9,25};
        int similar[]=new int[10];
        int count=0;
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    similar[count]=arr1[i];
                    count+=1;
                }
            }
        }
        System.out.println(Arrays.toString(similar));
    }
}