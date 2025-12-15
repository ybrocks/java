package C01Basic;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // List 선언
//        List<String> myList = new ArrayList<>();
//
//        // List값 1)직접 add하기
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//
//        // List값 2)배열을 List로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(arr));
//
//        // List 출력 - 컬렉션프레임워크 기본적으로 toString메서드가 구현 및 자동호출
//        System.out.println(myList); //주소값이 아닌 값을 출력

        // List안의 자료타입으로 기본형은 사용불가
//        int[] intArr = {10,20,30};
//        List<Integer> myList3 = new ArrayList<>(); // List<Integer> 선언
//        for (int i : intArr){
//            myList3.add(i); //add(i)가 int -> Integer로 오토박싱
//        }
//        System.out.println(myList3);

        // add : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        System.out.println(myList);
//        myList.add(0, 10); // 인덱스를 지정해 중간에 데이터를 넣는것은 나머지값들의 위치를 옮겨야하기때문에 비효율적
//        System.out.println(myList);

        // get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(2));

        // size() : 리스트의 개수(길이) 반환
//        System.out.println(myList.size());

        // List 값 출력
        // 1)일반 for문(index활용)
//        for (int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
        // 2)향상된 for문
//        for (int a : myList){
//            System.out.println(a);
//        }

        // remove : 값 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList);
//        myList.remove(myList.size()-1);
//        System.out.println(myList);

        // indexOf : 특정값을 찾아 index return(가장 먼저 나오는 값)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList.indexOf(30));

        // contains : 값이 있는지 없는지 여부를 return
//        System.out.println(myList.contains(35)); //true or false

        // 정렬
        // 1)Collections클래스의 sort메서드 사용
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(1);
//        myList.add(2);
//        myList.add(4);

//        System.out.println(myList);
//        Collections.sort(myList); //오름차순
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder()); //내림차순
//        System.out.println(myList);

        // 이중리스트 : 리스트안의 리스트 [[1,2,3], [4,5,6]]
//        List<List<Integer>> myList = new ArrayList<>(); //이중리스트 선언
//        List<Integer> m1 = new ArrayList<>(); //별개의 리스트 m1 선언
//        myList.add(m1); //m1을 이중리스트안에 삽입 [[]]
//        myList.add(new ArrayList<>()); // 새로운 리스트를만들어 이중리스트에 삽입[[], []]
        // 리스트를 따로 선언(m1)해서 넣으나 new ArrayList로 새로운리스트를 만들어 넣으나 똑가음
//        m1.add(1);
//        m1.add(2);
//        m1.add(3); // [[1,2,3], []]
//        System.out.println(myList);
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);
//        System.out.println(myList);

        // [[1,2,3], [4,5,6], [7,8,9,], ...[58,59,60]]
        List<List<Integer>> myList = new ArrayList<>();
        for (int i=0; i<20; i++){
            myList.add(new ArrayList<>());
        } // 이중리스트안에 20개의 리스트 생성
        int num = 1; // 리스트안에 숫자를 삽입하기위해 num 선언
        for (int i=0; i<20; i++){ //20개의 리스트에 순서대로
            for (int j=0; j<3; j++){ //3개씩 값을
                myList.get(i).add(num); //삽입
                num++;
            }
        }
        System.out.println(myList);


    }
}
