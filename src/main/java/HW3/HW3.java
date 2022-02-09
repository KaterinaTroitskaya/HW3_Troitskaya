package HW3;

import java.util.Arrays;

import static java.lang.System.out;

public class HW3 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(arr));
        int [] newarr = invertTheArray(arr);
        System.out.println(Arrays.toString(newarr));
        int [] hugearr = new int[100];
        fillTheArray(hugearr);
        System.out.println(Arrays.toString(hugearr));
        int [] arrForTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        smallNumbersDoubler(arrForTask3);
        out.println(Arrays.toString(arrForTask3));

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
    //region Task2
    public static void fillTheArray(int[]arr){
        for (int i = 0, j=1; i < arr.length; i++, j++){
            arr[i]=j;
        }
    }
    //endregion
    //region Task3
    public static void smallNumbersDoubler(int[] arr){
        for(int i=0; i<arr.length; i++){
            if (arr[i]<6){
                arr[i] = arr[i]*2;
            }
        }
    }
    //endregion


}
