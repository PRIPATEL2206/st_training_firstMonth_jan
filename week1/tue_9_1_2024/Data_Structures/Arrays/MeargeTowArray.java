import java.util.Arrays;

public class MeargeTowArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 4, 5, 6, 7, 8, 9 };

        int i1 = 0;
        int i2 = 0;
        int[] meargeArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr2.length + arr1.length; i++) {
            if (i2<arr2.length && i1<arr1.length && arr1[i1] < arr2[i2]) {
                meargeArr[i] = arr1[i1];
                i1++;
            } else if (i2<arr2.length) {
                 meargeArr[i] = arr2[i2];
                i2++;
            }
        }
        System.out.println(Arrays.toString(meargeArr));

    }
}
