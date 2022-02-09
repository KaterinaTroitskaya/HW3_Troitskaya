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
        int [][] squareTask4 = new int[5][5];
        setDiagonal(squareTask4);
        int[] arrForTask5 = crateAnArray(8,3);
        findMinAndMax(arrForTask3);
        isItLucky(arrForTask3);

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
    //region Task4
    public static void setDiagonal(int[][]square){
        out.println("Task 4: ");
        for (int i=0; i<square.length; i++){
            for (int j=0; j<square[i].length; j++){
                if (i==j) {
                    square[i][j] =1;
                } else if (i==((square[i].length-1)-j)) {
                    square[i][j] = 1;
                } else square[i][j]=5;
                out.print(square[i][j] +" ");
            }
            out.println();
        }
    }
    //endregion
    //region Task5
    public static int[] crateAnArray (int len, int initialValue){
        int[] createdArr = new int[len];
        for (int i=0; i<createdArr.length; i++){
            createdArr[i]=initialValue;
        }
        out.println(Arrays.toString(createdArr));
        return createdArr;
    }
    //endregion
    //region Task6
    public static void findMinAndMax(int[] arr){
        int min= arr[0];
        int max= arr[0];
        for (int i=1; i<arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int j=1; j<arr.length; j++) {
            if (max<arr[j]){
                max = arr[j];
            }
        }

        out.println("Task 6: Минимальным числом в массиве "+Arrays.toString(arr) +" является "+min);
        out.println("Task 6: Максимальным числом в массиве "+Arrays.toString(arr) +" является "+max);
    }
    //endregion
    //region Task7
    public static boolean isItLucky(int[]arr){
        boolean lucky = false;
        int right = 0;
        int left = arr[0];
        for (int r=1; r<arr.length; r++) {
            right = right + arr[r];
        }
        for (int l=1; l<(arr.length-1); l++) {
            if (left == right) {
                lucky = true;
            } else {
                left = left + arr[l];
                right = right - arr[l];
            }
        }
        return lucky;
    }
    //endregion

}
