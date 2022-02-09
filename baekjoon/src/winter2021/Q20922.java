package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q20922 {
    public int solution(int[] arr, int[] ch, int N, int K){
        int lt = 0;
        int length = 1;
        int answer = 1;
        ch[arr[lt]] = 1;

        for(int rt = 1; rt < N;){
            int rtVal = arr[rt];
            int ltVal = arr[lt];

            if(ch[rtVal] == K){
                ch[ltVal] -= 1;
                length--;
                lt++;
            }else{
                ch[rtVal] += 1;
                length++;
                rt++;
            }

            answer = Math.max(answer, length);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Q20922 T = new Q20922();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] ch  = new int[100001];
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(arr, ch, N, K));
    }
}
