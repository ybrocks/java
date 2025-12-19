package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
        //java에서는 비교를 위한 인터페이스가 대표적으로 2개 제공
        //1)Comparator 인터페이스 : 인터페이스내 compareTo메서드만 존재
        //2)Comparable 인터페이스 : 인터페이스내 compare메서드만 존재

        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(10);
        myList.add(30);
        //java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구
        myList.sort(Comparator.naturalOrder());
        //o1과o2의 숫자값을 마이너스 형식으로 코딩을 하되 o1이 먼저있으면 오름차순 o2가 먼저면 내림차순
        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        List<String> myList2 = new ArrayList<>();
        myList2.add("java");
        myList2.add("python");
        myList2.add("C++");

        //기본적인 문자정렬일때는 Comparator커스텀을 하지않고
        //복잡한 자신만의 정렬기준을 가지고 정렬할때 Comparator익명개체 생성
        //ex)문자열의 길이로 정렬하되 문자열의 길이가 같은 경우에는 알파벳순으로 정렬
        Collections.sort(myList2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }else {
                    return o1.length()-o2.length();
                }
            }
        });
        System.out.println(myList2);

        // 백준 : 단어정렬

        //배열, 리스트 정렬외에 정렬자료구조(TreeSet,pq)
        Queue<String> pq = new PriorityQueue<>();

        Set<String> treeSet = new TreeSet<>();

        // 백준 : 최대값힙

        // 백준 : 선긋기


    }
}
