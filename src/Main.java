//import javax.swing.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        Map<String, Integer> map = new HashMap<>();
//
//        //title별 value입력
//        for (int i=0; i<N; i++){
//            String title = br.readLine();
//            map.put(title, map.getOrDefault(title, 0)+1);
//        }
//        //최대value찾기
//        int max = Integer.MIN_VALUE;
//        String maxkey = "";
//        for (String title : map.keySet()){
//            int value = map.get(title);
//            if (max < value){
//                max = value;
//                maxkey = title;
//            }
//        }
//        System.out.println(maxkey);
//        }
//    }