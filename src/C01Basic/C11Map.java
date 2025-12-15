package C01Basic;

import java.util.*;

public class C11Map {
    public static void main(String[] args) {
        // Map : key, value로 이루어진 자료구조
        // 특징 : 1.중복X(key), 2.순서X, 3.빠르다
//        Map<String, Integer> sports = new HashMap<>();
//
//        // 1)key는 중복X, value는 중복O
//        sports.put("농구", 2);
//        sports.put("축구", 3);
//        sports.put("배구", 2);
//        sports.put("농구", 3);

        // 2)map의 key에는 순서가 없음
//        System.out.println(sports);

        // 3)map에서 key값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));

        //map의 전체 value데이터 출력
        //map의 key값 접근시에는 index 사용 불가(순서가 없기 때문)
        //keySet() : map의 전체 key목록을 반환하는 메서드
//        Set<String> mySet = sports.keySet();
//        for (String a : sports.keySet()){
//            System.out.println("key : " + a + " value : "+sports.get(a));
//        }       //복잡도N
//
//        //values() : map의 전체 value목록을 반환하는 메서드(잘 안쓰임)
//        for (int a : sports.values()){
//            System.out.println(a);
//        }

//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("축구", 2);
//        sports.put("농구", 3);
//        sports.put("배구", 2);
//
//        //remove : key를 통해 Map요소 삭제
//        sports.remove("축구");
//        System.out.println(sports);
//
//        // PutIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("배구", 10);
//        System.out.println(sports);
//
//        sports.put("배구", 10); //put은 덮어쓰기 가능
//        System.out.println(sports);
//
//        // containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("야구")); //false
//        System.out.println(sports.containsKey("배구")); //true

//        map을 통한 개수 count
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"}; //농구2 축구2 야구1
//        Map<String, Integer> map = new HashMap<>();
//        // 담으려는 키가 있으면 기존것+1
//        for (String a : arr){
////            if (map.containsKey(a)){
////                map.put(a, map.get(a)+1);
////            } else {
////                map.put(a, 1);
////            }
//            // getOrDefault(키값,초기값) : key값이 있으면 있는값 리턴, 없으면 초기값 리턴
//            map.put(a, map.getOrDefault(a, 0)+1);
//        }
//            System.out.println(map);

        //map의 value값 감소 로직
//        String[] arr2 = {"농구", "농구", "농구", "야구", "축구"};
//        // 축구1만 남도록 코드작성
//        Map<String, Integer> mymap = new HashMap<>();
//        for (String a : arr2){
//            if (mymap.containsKey(a)){
//                if (mymap.get(a)==1){
//                    mymap.remove(a);
//            } else{
//                    mymap.put(a, mymap.get(a)-1);
//                }
//            }
//        }
//        System.out.println(mymap);

        //가장 value가 큰 key값 찾기
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구",3);
//        myMap.put("농구",2);
//        myMap.put("야구",1);
//
//        int max = Integer.MIN_VALUE;
//        String maxkey = "";
//        for (String a : myMap.keySet()){
//            int value = myMap.get(a);
//            if (max < value){
//                max = value;
//                maxkey = a;
//            }
//        }
//        System.out.println(maxkey);

//        Map<String, Integer> myMap = new HashMap<>();
//
//        int max = Integer.MIN_VALUE;
//        String maxkey = "";
//        for (String a : myMap.keySet()){
//            int value = myMap.get(a);
//            if (max < value){
//                max = value;
//                maxkey = a;
//            }
//        }
//        System.out.println(maxkey);

        //TreeMap : key를 정렬(오름차순)하여 map저장
//        Map<String, Integer> myMap = new TreeMap<>();
//        Map<String, Integer> myMap = new TreeMap<>(Comparator.reverseOrder()); //내림차순
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        System.out.println(myMap);

        // treemap문제 : 백준-파일정리

        // LinkedHashMap : 데이터의 삽입 순서 보장(입력시간순정렬)
//        Map<String, Integer> myMap = new LinkedHashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        for (String a : myMap.keySet()){
//            System.out.println(a + " " + myMap.get(a));
//        }

        // Iterator를 활용한 출력
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("야구", 2);
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        Iterator<String> iters = myMap.keySet().iterator();
        // next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iters.next());
        // hasNext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean리턴
//        System.out.println(iters.hasNext());
//        while (iters.hasNext()){
//            System.out.println(iters.next());
//        }


    }
}
