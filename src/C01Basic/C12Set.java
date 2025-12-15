package C01Basic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C12Set {
    public static void main(String[] args) {
        // set의 특성 : 중복X, 순서X, 성능(복잡도) - O(1)
//        Set<String> mySet = new HashSet<>();
//        mySet.add("야구");
//        mySet.add("농구");
//        mySet.add("야구");
//        mySet.add("축구");
//        System.out.println(mySet);
//        System.out.println(mySet.contains("야구")); //복잡도O(1)

        //수 찾기 문제 1920

        // TreeSet : 데이터를 오름차순 정렬
//        Set<String> mySet2 = new TreeSet<>();
//        mySet2.add("야구");
//        mySet2.add("농구");
//        mySet2.add("야구");
//        mySet2.add("축구");
//        System.out.println(mySet2);

        // 백준 : 숫자카드10815, 프로그래머스 : 폰켓몬

        // 집합관련함수 : 교집합(retailAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> s1 = new HashSet<>();
//        s1.add("java");
//        s1.add("python");
//        s1.add("C++");
//        Set<String> s2 = new HashSet<>();
//        s2.add("java");
//        s2.add("html");
//        s2.add("css");
//        s1.retainAll(s2); //s1에는 교집합인 java만 남음
//        System.out.println(s1);
//        s1.addAll(s2); //s1에는 합집합인 java, python, C++, html, css가 남음
//        System.out.println(s1);
//        s1.removeAll(s2); //s1에는 차집합인 python, C++만 남음
//        System.out.println(s1);


    }
}
