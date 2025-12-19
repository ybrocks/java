package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C13RecursiveCombiPermuPractice2 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        List<List<Integer>> combiList = new ArrayList<>();
        combi(0, 2, myList, new ArrayList<>(), combiList);
        System.out.println(combiList);

        List<List<Integer>> permuList = new ArrayList<>();
        permu(2, new boolean[myList.size()], myList, new ArrayList<>(), permuList);
        System.out.println(permuList);

    }
    public static void combi(int start, int n, List<Integer> myList, List<Integer> temp, List<List<Integer>> combiList){
        if (temp.size()==2){
            combiList.add(new ArrayList<>(temp));
            return;
        }
        for (int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(i+1, 2, myList, temp, combiList);
            temp.remove(temp.size()-1);
        }
    }
    public static void permu(int n, boolean[] visited, List<Integer> myList, List<Integer> temp, List<List<Integer>> permuList){
        if (temp.size()==n){
            permuList.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0; i<myList.size(); i++){
            temp.add(myList.get(i));
            visited[i] = true;
            permu(n, visited, myList, temp, permuList);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}
