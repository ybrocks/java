package C01Basic;

import javax.management.IntrospectionException;
import javax.management.QueryEval;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Practice {
    public static void main(String[] args){
        //C11Map
        //Map : key, value로 이루어진 자료구조
        //특징 : 1.중복X 2.순서X 3.빠른성능 (key-중복O/value-중복X)
//        Map<String, Integer> map = new HashMap<>();
//        map.put("농구", 2);
//        map.put("축구", 3);
//        map.put("배구", 2);
//        map.put("농구", 3);
////        System.out.println(map);
////        System.out.println(map.get("농구")); //특정key조회 O(1)
//
//        //Map의 key값은 index사용불가(순서X)
//        //KeySet() : Map의 전체 Key값 조회 메서드
//        Set<String> mySet = map.keySet();
//        System.out.println(map.keySet()); //key값 출력
//        for (String a : map.keySet()) {
//            System.out.println("key:" + a + " value:" + map.get(a)); //key별 value값 출력
//        } //복잡도N
//        //values() : map의 전체 value목록 반환(잘안씀)
//        for (int a : map.values()){
//            System.out.println(a);
//        }
//        Map<String, Integer> sport = new HashMap<>();
//        sport.put("축구", 2);
//        sport.put("농구", 3);
//        sport.put("배구", 5);
//        //remove : key를 통해 Map요소 삭제
//        sport.remove("농구");
//        System.out.println(sport);
//        //PutIfAbsent : key값이 없는 경우만 put
//        sport.putIfAbsent("야구", 3);
//        sport.putIfAbsent("축구", 7);
//        System.out.println(sport);
//        //put은 덮어쓰기 가능
//        sport.put("축구", 7);
//        System.out.println(sport);
//        //containsKey : key가 있으면 true, 없으면 false
//        System.out.println(sport.containsKey("축구"));
//        System.out.println(sport.containsKey("수영"));

        //Map을 통한 개수 count
        String[] arr = {"농구", "축구", "야구", "축구", "야구"}; //농구1축구2야구2
        Map<String, Integer> map = new HashMap<>();

        for (String a : arr){
            if (map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
            //getOrDefault(키값,초기값) : key값이 있으면 값 리턴, 없으면 초기값 리턴
//            map.put(a, map.getOrDefault(a, 0)+1);
        }
        System.out.println(map);



        //C12Set
        //Set(정렬) 특성 : 중복X, 순서X, 복잡도O(1)
//        Set<String> mySet = new HashSet<>();
//        mySet.add("농구");
//        mySet.add("축구");
//        mySet.add("야구");
//        mySet.add("농구");
//        System.out.println(mySet);
//        System.out.println(mySet.contains("배구")); //값 조회true or false, 복잡도O(1)

//        //TreeSet : 데이터 오름차순 정렬
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("야구");
//        mySet.add("축구");
//        mySet.add("농구");
//        mySet.add("야구");
//        System.out.println(mySet);

        //집합관련함수 : 교집합(retailAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> s1 = new HashSet<>();
//        s1.add("java");
//        s1.add("python");
//        s1.add("C++");
//
//        Set<String> s2 = new HashSet<>();
//        s2.add("java");
//        s2.add("html");
//        s2.add("css");

//        s1.retainAll(s2);
//        System.out.println(s1);
//        s1.addAll(s2);
//        System.out.println(s1);
//        s1.removeAll(s2);
//        System.out.println(s1);

//        //C13QueueStackDeque
//
//        //Queue : 인터테이스를 LinkedList로 구현한 방식을 주로 사용(선입선출)
//        add(삽입), offer(제한삽입), poll(첫번째값 출력,제거), peek(조회)

//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue);
//
//        //poll : Que 가장 앞의 데이터를 삭제하면서 출력하는 메서드
//        int value = myQue.poll();
//        System.out.println(value);
//        System.out.println(myQue);
//
//        //peek : Que 가장 앞의 데이터를 조회(출력)만 하는 메서드
//        int value2 = myQue.peek();
//        System.out.println(value2);
//
//        //while문을 통한 queue출력 - 대기열 처리 기능
//        Queue<String> myQUe2 = new LinkedList<>();
//        myQUe2.add("대기1");
//        myQUe2.add("대기2");
//        myQUe2.add("대기3");
//        myQUe2.add("대기4");
//        System.out.println(myQUe2);
//        while (!myQUe2.isEmpty()){
//            System.out.println(myQUe2.poll());
//        }
//        //LinkedList - ArrayList 성능 비교
//        //LinkedList - 중간 삽입/삭제 빠름, 조회 느림
//        //ArrayList -  중간 삽입/삭제 느림, 조회 빠름
//        //long start/endtime으로 작업소요시간 비교
//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//        long starttime = System.currentTimeMillis(); //작업시작시간
//        for (int i=0; i<1000000; i++){
//            myLinkedList.add(0, i);
//        }
//        long endtime = System.currentTimeMillis(); //작업끝나는시간
//        System.out.println("LinkedList 중간삽입 소요시간" + (endtime-starttime));
//
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        long starttime2 = System.currentTimeMillis();
//        for (int i=0; i<1000000; i++){
//            myArrayList.add(0, i);
//        }
//        long endtime2 = System.currentTimeMillis();
//        System.out.println("ArrayList 중간삽입 소요시간" + (endtime2-starttime2));
//
//        //길이제한 큐 (주로offer사용)
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3); //길이:3
//        blockingQueue.add("회원1");
//        blockingQueue.add("회원2");
//        blockingQueue.add("회원3");
//        blockingQueue.add("회원4"); //add길이 초과시 에러
//        System.out.println(blockingQueue); //에러
//
//        blockingQueue.offer("회원1");
//        blockingQueue.offer("회원2");
//        blockingQueue.offer("회원3");
//        blockingQueue.offer("회원4"); //제한길이까지add. 에러X
//        System.out.println(blockingQueue); //[회원1, 회원2, 회원3]
//
//        //우선순위 큐(pq) : 데이터를 poll할때 정렬된 데이터 결과값(최소값/최대값)보장
//        //지속적으로 데이터가 추가/제거되면서 전체데이터가 실시간으로 변경되는 상황에 사용
//        //변경되지않는 데이터를 정렬할땐 List사용
//        Queue<Integer> pq = new PriorityQueue<>(); //힙자료구조
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//            //poll할때마다 최소값을 추출 - log(n), peek은 최소값 확인만 - log(n)
//            //전체데이터 poll시 n*log(n)
//        최대값추출 - Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder);
//        }
//        System.out.println(pq);
//
//        //Stack : 후입선출 - 마지막값과 지금 넣으려는 값 비교
//        push(삽입), pop(제거), peek(조회), size(길이), isEmpty

//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack); //[10,20,30]
//        System.out.println(myStack.pop()); //마지막 입력값 출력,삭제
//        System.out.println(myStack); //[10, 20]
//        System.out.println(myStack.peek()); //마지막 입력값 조회
//        System.out.println(myStack); //[10,20]
//        System.out.println(myStack.size()); //길이
//        System.out.println(myStack.isEmpty()); //false
//
//        //Deque - Queue+Stack 양방향 큐
//        //메서드 - addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
//        Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addFirst(10);
//        myDeque.addLast(20);
//        myDeque.addLast(30);
//        System.out.println(myDeque);
//        System.out.println(myDeque.pollFirst());
//        System.out.println(myDeque.pollLast());
//        System.out.println(myDeque);
    }
}
