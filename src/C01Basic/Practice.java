package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {
        //배열의 정렬
//        String[] stArr = {"abc", "aaa", "acd", "abb"};
//
//        Arrays.sort(stArr); //정렬(오름차순)
//        System.out.println(Arrays.toString(stArr));
//
//        Arrays.sort(stArr, Comparator.reverseOrder()); //정렬(내림차순)
//        System.out.println(Arrays.toString(stArr));

//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

        // 선택정렬
        // 1)2중 for문을 사용하여 index마다 최소값찾기
        // 2)현재위치와 자리바꾸기
        int[] arr = {17,12,20,10,15};

        //방법 1
        for(int i=0; i<arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));

        //방법 2
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
        }
        System.out.println(Arrays.toString(arr));
    }
}
