import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> myList = new ArrayList<>();
        for (int i=1; i<=N; i++){
            myList.add(i);
        }

        permu(N, M, new boolean[N], myList, new ArrayList<>());

        System.out.println(sb);

    }
    public static void permu(int N, int M, boolean[] visited, List<Integer> myList, List<Integer> temp){
        if (temp.size()==M){
            for (int i=0; i<temp.size(); i++){
                sb.append(temp.get(i)).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i=0; i<N; i++){
            if (visited[i]) continue;
            visited[i] = true;

            temp.add(myList.get(i));
            permu(N, M, visited, myList, temp);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}