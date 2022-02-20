package no_6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class mischief {
    public int[] solution(int N, int[] classNum) {
        int[] answer = new int[2];
        int count = 0;
        int same = 0;

        for(int i = 0; i <N - 1; i++){
            if(same > 0 && classNum[i] > classNum[i+1] && count ==0){
                answer[count++] = i - (same);
                answer[count++] = i;
                break;
            }
            else if(classNum[i] > classNum[i+1]){
                answer[count++] = i;
            }else if(classNum[i] == classNum[i+1]){
                same++;
            }else if(classNum[i] < classNum[i+1]){
                same = 0;
            }
        }
        answer[0] += 1;
        answer[1] += 2;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        mischief T = new mischief();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] classNum = new int[N];
        for(int i = 0; i < N; i++){
            classNum[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer = T.solution(N,classNum);
        for(int i = 0; i < answer.length; i++) System.out.print(answer[i] + " ");
    }
}