class MaxOfArr{
    public static void main(String [] args){
        int[] arr={24,45,456,2,35,567};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}