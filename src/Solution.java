//import java.util.*;
//
//public class Solution {
//    public int[] solution(int []arr) {
//        Stack<Integer> mystack = new Stack<>();
//
//        for (int i=0; i< arr.length; i++){
//            if (mystack.isEmpty()){
//                mystack.push(arr[i]);
//            }else {
//                if (mystack.peek()!=arr[i]){
//                    mystack.push(arr[i]);
//                }
//            }
//        }
//        int[] answer = new int[mystack.size()];
//        for (int i=0; i<mystack.size(); i++){
//            answer[i] = mystack.get(i);
//        }
//        return answer;
//    }
//}