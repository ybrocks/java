//import javax.swing.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//import java.util.logging.XMLFormatter;
//import static com.sun.tools.javac.main.Option.X;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < N; i++) {
//            int X = Integer.parseInt(br.readLine());
//
//            if (X == 0) {
//                if (pq.isEmpty()) sb.append(0).append('\n');
//                else sb.append(pq.poll()).append('\n');
//            } else {
//                pq.add(X);
//            }
//        }
//        System.out.println(sb.toString());


//        class Solution {
//            public int solution(int[] scoville, int K) {
//                PriorityQueue<Long> pq = new PriorityQueue<>();
//                for (int X : scoville) pq.add((long) X);
//
//                int count = 0;
//
//                while (!pq.isEmpty() && pq.peek() < K) {
//                    if (pq.size() < 2) return -1;
//
//                    long a = pq.poll();
//                    long b = pq.poll();
//                    long mixed = a + (b * 2);
//
//                    pq.add(mixed);
//                    count++;
//                }
//                return count;
//            }
//        }