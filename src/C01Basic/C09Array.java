package C01Basic;

import java.util.*;

public class C09Array {
    public static void main(String[] args) {
        // 배열표현식1 : 배열을 선언 후 값 할당 방식
        // java의 배열은 반드시 사전에 길이가 결정되어야함
//        int[] arr1 = new int[5];
//        arr1[0]=10;
//        arr1[1]=20;
//        // int배열의 경우 선언시 기본적으로 0으로 초기화. boolean은 false로 초기화. 참조자료형은 null로 초기화
//        arr1[3]=40;
//        arr1[4]=50;
////        arr1[5]=60; // index out of bounds 예외 발생
//
//        // 배열표현식2 : 리터럴방식
//        int[] arr2 = {10,20,30,40,50};
//
//        // 배열표현식3 : 명시적 배열 생성 방식
//        int[] arr3 = new int[]{10,20,30,40,50};
//
//        // 배열표현식3 활용예시 : 배열을 다른 메서드의 매개변수로 사용할 경우
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.add(new int[]{10,20,30,40,50});
        // myList.add({10,20,30,40,50}); // 사용불가(배열인지 아닌지 확인불가)

        // 85,65,90으로 구성된 int배열을 선언하고, 총합과 평균을 구하시오
//        int[] arr = new int[]{85,65,90};
//        int sum = 0;
//        for (int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }

        // 배열의 최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        // 최대값을 구할때는 가장 작은 값을 설정
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i=0; i<arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

        // 배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0]; //템프로 킵해두기
//        arr[0] = arr[1];
//        arr[1] = temp;

        // 배열 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for (int i=0; i<arr.length; i++){
//            newArr[arr.length-1-i]=arr[i];
//        }
//        int index = 0;
//        for (int i=arr.length-1; i>=0; i--){
//            newArr[index] = arr[i];
//            index++;
//        }

        // 12.11 목

        // 배열의 정렬
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr); // 기본적으로 오름차순 정렬
//        System.out.println(Arrays.toString(stArr));
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순 정렬
//        System.out.println(Arrays.toString(stArr));
//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr); //오름차순 정렬
//        Arrays.sort(arr, Comparator.reverseOrder()); //원시자료형은 Comparator 사용불가

        // 선택정렬을 알고리즘 구현
        // 구현로직 : 1)2중for문을 사용하여 index마다 최소값찾기 2)현재위치와 자리 바꾸기
//        int[] arr = {17,12,20,10,15};
//        방법1-1.
//        for(int i=0; i<arr.length; i++){
//            int min = Integer.MAX_VALUE;
//            int index = i;
//            for(int j=i; j<arr.length; j++){
//                if(arr[j]<min){
//                    min=arr[j];
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//          1-2)
//        for(int i =0; i< arr.length;i++){
//            int min =arr[i];
//            int minIndex=i;
//            for(int j =i+1;j<arr.length;j++){
//                if(arr[j]<min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
////                자리바꾸기 : i 와 index 자리 change
//            int temp = arr[i];
//            arr[i]=arr[minIndex];
//            arr[minIndex]=temp;

        // 방법2.
//        for(int i=0; i<arr.length; i++){
//            for(int j=i; j<arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // 선택정렬의 복잡도는 O(n^2). java기본내장 정렬함수의 복잡도는 O(n*log(n))

        // 조합문제 : 모두 각기 다른 숫자의 배열이 있을때, 만들어질수 있는 두 숫자의 조합 출력
//        int[] arr = {10,20,30,40,50};
////        ex) (10,20), (10,20),
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++) {
//                System.out.println("("+arr[i]+","+arr[j]+")");
//            }
//        }

        // 배열의 중복제거 : Set자료구조(중복X, 순서X) 활용
        // ex)10,20,30,40만 남도록
//        int[] arr = {10,30,20,30,10,40};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : arr){
//            mySet.add(a);
//        }
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet){
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

        //프로그래머스 - 두 개 뽑아서 더하기(조합+중복제거)

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        Set<Integer> mySet = new HashSet<>();
//
//        for (int i=0; i<arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int sum = arr[i] + arr[j];
//                mySet.add(sum);
//            }
//        }
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet){
//            answer[index] = a;
//            index++;
//        }
//                Arrays.sort(answer);
//                System.out.println(Arrays.toString(answer));

        // 배열의 검색 : 복잡도 O(n)
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
//        //target이 몇번째 index에 있는지 출력
//        int index = -1;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

        // 이분탐색(이진검색) - binary search, 복잡도 log(n)
        // 사전에 데이터가 오름차순 정렬돼있는 경우만 이분탐색 가능
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
//        // 찾고자하는 값이 있으면 해당 index리턴
//        // 찾고자하는 값이 없으면 음수값 리턴
//        int index = Arrays.binarySearch(arr, target);
//        int index2 = Arrays.binarySearch(arr, 13);
//        System.out.println(index);
//        System.out.println(index2);

        // 백준 수 찾기(1920)

        // 배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); //false
//        System.out.println(Arrays.equals(arr1, arr2)); //true

        // 배열복사
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(Arrays.toString(arr2));

        // Arrays.fill : 배열에 모든값을 변경(채우기)
        // 1)for문으로 채우기
//        String[] arr = new String[5];
//        for(int i=0; i< arr.length; i++){
//            arr[i] = "";
//        }
        // 2)Arrays.fill사용
//        Arrays.fill(arr, "");

        // 2차원배열의 선언과 값할당
        // {{1,2}, {1,2}, {1,2}}
        // 방법1)선언후 할당방식
//        int[][] arr1 = new int[3][2];
//        arr1[0][0]=1;
//        arr1[0][1]=2;
//        arr1[1][0]=1;
//        arr1[1][1]=2;
//        arr1[2][0]=1;
//        arr1[2][1]=2;
//
//        // 방법2)리터럴방식
//        int[][] arr2 = {{1,2}, {1,2}, {1,2}};

        // [3][4]사이즈의 2차원배열을 선언하고, 1~12까지 숫자값을 각 배열에 순차적으로 할당
        // {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}

        int[][] arr = new int[3][4];
        int num = 1;
        for (int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = num; //배열에 num할당
                num++; // 할당후 ++
            }
        }
        //2차원배열의 출력
        System.out.println(arr);    //2차원배열의 heap주소값
        System.out.println(Arrays.toString(arr)); //각1차원배열의 heap 주소값
        System.out.println(Arrays.deepToString(arr));  //각1차원배열의 값 출력


        // 프로그래머스 - 행렬의 덧셈 / K번째수

        //가변배열 : 2차원 배열에서 각 1차원의 배열의 길이가 서로 다를수 있는 배열의 구조
        int[][] arr1 = {{1,2}, {1,2,3}, {1,2,3,4}};

        // 배열 전체길이는 반드시 사전할당되어야하지만, 1차원배열의 길이는 추후 할당가능
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];
    }
}