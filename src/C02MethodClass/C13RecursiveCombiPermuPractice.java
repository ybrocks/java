
package C02MethodClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C13RecursiveCombiPermuPractice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        List<List<Integer>> combiList = new ArrayList<>();
        combi(new ArrayList<>(), 0, myList, 2, combiList);
        System.out.println(combiList);

        List<List<Integer>> permuList = new ArrayList<>();


    }
    public static void combi(List<Integer> temp, int start, List<Integer> myList, int n, List<List<Integer>> combiList){
        if (temp.size()==n){
            combiList.add(new ArrayList<>(temp));
            return;
        }
        for (int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(temp, i+1, myList, n, combiList);
            temp.remove(temp.size()-1);
        }
    }
}