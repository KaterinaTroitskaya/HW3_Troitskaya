package HW3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(arr));
        int [] newarr = invertTheArray(arr);
        System.out.println(Arrays.toString(newarr));

    }
    //region Task1
    public static int[] invertTheArray (int[]arr){
        for (int i =0; i<arr.length; i++){
            int x = arr[i];
            if (x != 0) {
                arr[i]=0;
            } else {
                arr[i] =1;
            }
        }
        return arr;
    }
    //endregion
}
