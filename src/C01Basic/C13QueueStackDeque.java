package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) {
        // Queue인터페이스를 Linkedlist를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
        // poll은 큐에서 가장 앞의 데이터를 삭제하면서 동시에 return하는 메서드
//        int value = myQue.poll();
//        System.out.println(value); //10
//        System.out.println(myQue); //20, 30
        //peek은 큐에서 데이터를 삭제하지않고 가장앞의 데이터를 return하는 메서드
//        int value2 = myQue.peek();
//        System.out.println(value2); //20
//        System.out.println(myQue); // 20,30

        // while문을 통한 queue출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
//        //Queue는 일반적으로 while문을 통해 요소를 소모
//        while (!printerQueue.isEmpty()){
//            System.out.println(printerQueue.poll());
//        }

        // LinkedList와 ArrayList 성능차이 비교
        // ArrayList 장점:조회성능빠름 / 단점:중간삽입, 삭제 성능 저하
        // LinkedList 장점:중간삽입, 삭제 성능 빠름 / 단점:조회성능 저하
//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//        long starttime = System.currentTimeMillis();
//        for (int i=0; i<1000000; i++){
//            myLinkedList.add(0, i);
//        }
//        long endtime = System.currentTimeMillis();
//        System.out.println("LinkedList에 중간에 값 add 시에 소요시간 : " + (endtime-starttime));
//
//
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        long starttime2 = System.currentTimeMillis();
//        for (int i=0; i<1000000; i++){
//            myArrayList.add(0, i);
//        }
//        long endtime2 = System.currentTimeMillis();
//        System.out.println("ArrayList에 중간에 값 add 시에 소요시간 : " + (endtime2-starttime2));

        // 관련문제 : 카드2, 요세푸스

        // 길이 제한 큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); //(add)길이 초과시 에러 발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); //(offer)제한된 길이까지만 add. 에러발생X
//        System.out.println(blockingQueue);

        // 우선순위 큐 : 데이터를 poll할때 정렬된 데이터 결과값(최소값/최대값) 보장
        // 지속적으로 데이터가 추가/제거되면서 전체데이터가 실시간으로 변경되는 상황에 사용(정해진 데이터를 넣어놓고 정렬하면 List)
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while (!pq.isEmpty()){
            // poll할때마다 최소값을 추출하게되고 복잡도 log(n). peek은 최소값을 확인만하고 추출은X 복잡도 log(n)
            // 전체 데이터를 모두 poll하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }

        //백준 최소힙 / 프로그래머스 더 맵게

        //백준 최대힙 : poll할때마다 최대값을 추출
        //Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder);

        //pq에서 데이터 하나를 poll : log(n)

        //pq에서 전체데이터를 모두 poll : n*log(n)
        //1)add하고 poll : log(n)
        //2)add하고 poll :

        //list에서 전체데이터를 정렬 : n*log(n)
        //1)중간중간 값을 add하고 다시정렬
        //2)n^2*log(n)


        // Stack : 후입선출의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); //마지막에 입력한 값을 꺼낸다
//        System.out.println(myStack.peek()); //마지막에 입력한 값 조회
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());

        //프로그래머스 올바른 괄호, 같은 숫자는 싫어

        //Deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addLast(10);
        myDeque.addLast(20);
        myDeque.addFirst(30); // 30,10,20
        System.out.println(myDeque.pollLast()); //20
        System.out.println(myDeque.pollFirst()); //30
        System.out.println(myDeque.pollLast()); //10
        System.out.println(myDeque); // []

        // Queue
        // 1)LinkedList - 선입선출 자료구조
        // 2)pq - 힙자료구조

        // Stack - 마지막값과 지금 넣으려고 하는 값비교

        // Deque - queue와 stack을 결합한 양방향 큐

    }
}
