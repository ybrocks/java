//package C05AnonymousLambda;
//
//import java.util.*;
//
//public class C03ComparatorComparable {
//    public static void main(String[] args) {
//        //java에서는 비교를 위한 인터페이스가 대표적으로 2개 제공
//        //1)Comparator 인터페이스 : 인터페이스내 compareTo메서드만 존재
//        //2)Comparable 인터페이스 : 인터페이스내 compare메서드만 존재
//
////        List<Integer> myList = new ArrayList<>();
////        myList.add(20);
////        myList.add(10);
////        myList.add(30);
////        //java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구
////        myList.sort(Comparator.naturalOrder());
////        //o1과o2의 숫자값을 마이너스 형식으로 코딩을 하되 o1이 먼저있으면 오름차순 o2가 먼저면 내림차순
////        myList.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o1-o2;
////            }
////        });
////
////        List<String> myList2 = new ArrayList<>();
////        myList2.add("java");
////        myList2.add("python");
////        myList2.add("C++");
//
//        //기본적인 문자정렬일때는 Comparator커스텀을 하지않고
//        //복잡한 자신만의 정렬기준을 가지고 정렬할때 Comparator익명개체 생성
//        //ex)문자열의 길이로 정렬하되 문자열의 길이가 같은 경우에는 알파벳순으로 정렬
////        Collections.sort(myList2, new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                if (o1.length()==o2.length()){
////                    return o1.compareTo(o2);
////                }else {
////                    return o1.length()-o2.length();
////                }
////            }
////        });
////        System.out.println(myList2);
//
//        // 백준 : 단어정렬
//
//        //배열, 리스트 정렬외에 정렬자료구조(TreeSet,pq)
////        Queue<String> pq = new PriorityQueue<>();
////
////        Set<String> treeSet = new TreeSet<>();
//
//        // 백준 : 절댓값 힙
//
//        // 백준 : 선긋기
//
//        // 리스트 안의 배열 정렬
//        // [{4,5}, {1,2}, {5,0}, {3,1}]
//        // 리스트 안의 배열에 1번째 index를 기준으로 오름차순 정렬
//        // 1)리스트선언후 배열넣기
//        // 2)정렬 - Comparator사용해 배열안의 index 1번째값으로 오름차순
////        List<int[]> myList = new ArrayList<>();
////        myList.add(new int[]{4,5});
////        myList.add(new int[]{1,2});
////        myList.add(new int[]{5,0});
////        myList.add(new int[]{3,1});
////
////        myList.sort(new Comparator<int[]>() {
////            @Override
////            public int compare(int[] o1, int[] o2) {
////                return o1[1] - o2[1];
////            }
////        });
////        for (int[] a : myList){
////            System.out.println(Arrays.toString(a));
////        }
//
//        //직접 만든 객체 정렬
//        //name, age변수
////생성자
////getter
////stString
////Student객체 List에 4개 담기
//
//        //방법1) Comparator를 구현한 익명객체 방식
//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("AAA", 25));
//        myList.add(new Student("BBB", 20));
//        myList.add(new Student("CCC", 23));
//        myList.add(new Student("DDD", 27));
//        myList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        //방법2) Comparable을 구현한 방식
//        //Student객체 안에 Comparable을 implements하는 방식
//        //sort실행시 자동으로 Student안의 compareTo메서드 호출
////        Collections.sort();
//    }
//}
//
//class Student implements Comparable<Student>{
////class Student{
//    private String name;
//    private int age;
//
//    public Student(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//    //Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
//    //this가 앞에 있으면 오름차순, 매개변수 객체가 앞에 있으면 내림차순
//    @Override
//    public int compareTo(Student o) {
//        return this.getName().compareTo(getName());
//    }
//}
