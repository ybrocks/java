import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; //길이가 N인 A배열 생성

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

            int M = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder(); // 여러줄 결과를 한번에 출력

        for (int i=0; i<M; i++){
            int target = Integer.parseInt(st.nextToken());
            int index = Arrays.binarySearch(A, target);
            
            if(index>=0) {
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb.toString());
        }
    }