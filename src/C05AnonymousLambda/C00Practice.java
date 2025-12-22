package C05AnonymousLambda;

import javax.imageio.ImageTranscoder;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C00Practice {
    public static void main(String[] args) {
//        //java에선는 비교를 위한 인터페이스가 대표적으로 2개 제공
//        //1)Comparator : compareTo메서드
//        //2)Comparable : compare메서드
//
////        List<Integer> myList = new ArrayList<>();
////        myList.add(20);
////        myList.add(10);
////        myList.add(30);
////        //java 대부분의 정렬함수는 매개변수로 Comparator객체 요구
////        myList.sort(Comparator.naturalOrder());
////
////        //o1과o2의 숫자값을 마이너스 형식으로 코딩을 하되
////        //o1이 먼저있으면 오름차순 o2가 먼저있으면 내림차순
////        myList.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o1-o2;
////            }
////        });
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("C++");
//
//        //기본적인 문자정렬일때는 Comparator 커스텀을 하지않고
//        //복잡한 자신만의 정렬기준을 가지고 정렬할때 Comparator 익명개체 생성
//        //ex)문자열의 길이로 정렬하되 문자열의 길이가 같은 경우에는 알파벳순으로 정렬
////        Collections.sort(myList2, new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                if (o1.length()==o2.length()){
////                    return o1.compareTo(o2);
////                }else {
////                    return o1.length()-o2.length();
////                }
////
////            }
////        });
////        System.out.println(myList2);
//
//        //배열, 리스트 정렬외에 정렬자료구조(TreeSet, pq)
////        Queue<String> pq = new PriorityQueue<>();
////        Set<String> treeSet = new TreeSet<>();
//
//        //리스트안의 배열 정렬
//        //[{4,5}, {1,2}, {5,0}, {3,1}]
//        //리스트안의 배열 첫번째 인덱스를 기준으로 오름차순
//        //1)리스트 선언 후 배열 넣기
//        //2)정렬 = Comparator사용해 배열안의 인덱스 첫번째값으로 오름차순
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4,5});
//        myList.add(new int[]{1,2});
//        myList.add(new int[]{5,0});
//        myList.add(new int[]{3,1});
//
//        myList.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
//        for (int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
        //직접 만든 객체 정렬
        //name, age변수
        //생성자
        //getter
        //toString
        //Student객체 List에 값 4개 담기
//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("AAA", 20));
//        myList.add(new Student("BBB", 30));
//        myList.add(new Student("CCC", 25));
//        myList.add(new Student("DDD", 35));
//        //객체 정렬 1)Comparator 구현 방식
//        myList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        System.out.println(myList);
//        //객체 정렬 2)Comparable 구현 방식
//        //Student객체 안에 Comparable을 implements
//        //sort실행시 자동으로 Student안의 compareTo메서드 호출
//    }
//}
//
////class Student implements Comparable<Student>{
//class Student{
//    private String name;
//    private int age;
//
//    public Student(String name, int age){
//        this.name=name;
//        this.age=age;
//    }
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//    @Override
//    public String toString() {
//        return "{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';

//        int[] arr = {20,10,4,12};
//        //전통적인 방식의 데이터 접근방법 : 메모리주소 접근
//        for (int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        //함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌 입력에 따른 출력만 존재하는 코딩 스타일
//        //streamAPI : 함수형 프로그래밍 라이브러리
//        //forEach : 스트림의 각요소를 하나씩 소모하면서 동작 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
//        //스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//        Stream<String> stream1 = myList.stream();
//        String[] myArr = {"java", "python", "C++"};
//        Stream<String> stream2 = Arrays.stream(myArr);

        //원시자료형 stream객체
//        int[] intArr = {10,20,30,40,50};
//        IntStream stream3 = Arrays.stream(intArr);

        //stream의 중개연산 메서드
        //filter, map, sorted, distinct, mapToInt

        //filter - 필터링, sum - 총합
//        int total = Arrays.stream(intArr).filter(a->a>29).sum();
//        System.out.println(total);
//        //map - 새로운 스트림으로 반환
//        int total2 = Arrays.stream(intArr).map(a->a*a).sum();
//        System.out.println(total2);
//        //distinct - 중복제거
//        int total3 = Arrays.stream(intArr).distinct().sum();
//        System.out.println(total3);
//        //sorted - 정렬
//        int[] sortedArr = Arrays.stream(intArr).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArr));
//        //mapToInt - IntStream형태로 변환
//        String[] stArr = {"java", "python", "C++"};
//        int totalLength = Arrays.stream(stArr).mapToInt(a->a.length()).sum();
//        System.out.println(totalLength);

//        int[] arr = {1,2,3,4,5,6};
//        // 홀수만 담은 배열 출력 - filter
//        int[] intArr = Arrays.stream(arr).filter(a->a%2!=0).toArray();
//        System.out.println(Arrays.toString(intArr));
//        // 홀수의 제곱값 배열 출력
//        int[] inArr2 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(inArr2));
//        // 홀수 제곱값을 오름차순으로 정렬한 배열 출력
//        int[] intArr3 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).sorted().toArray();
//        System.out.println(Arrays.toString(intArr3));

        //stream의 소모
        //forEach출력, sum합계, count, max, min, reduce누적, findFirst스트림의 첫번째값 리턴
        //forEach
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        //sum
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//        //count
//        long count = Arrays.stream(intArr).count();
//        System.out.println(count);
        //reduce 누적연산
        int[] intArr = {10,20,30,40};
        int accSum = Arrays.stream(intArr).reduce(0, (a, b)->a+b);
        System.out.println(accSum);
        int Multiply = Arrays.stream(intArr).reduce(1, (a,b)->a*b);
        System.out.println(Multiply);
        String[] stArr = {"java", "python", "C++"};
        String result = Arrays.stream(stArr).reduce("", (a,b)->a+b);
        System.out.println(result);

    }
}