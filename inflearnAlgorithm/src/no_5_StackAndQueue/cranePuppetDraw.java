package no_5_StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class cranePuppetDraw {
    public int solution(int N, int[][] arr, int[] moves) {
        Stack<Integer> stack = new Stack();
        int answer = 0;
        for (int move : moves) {
            for (int i = 0; i < N; i++) {
                if (arr[i][move - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == arr[i][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(arr[i][move - 1]);
                    }
                    arr[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        cranePuppetDraw T = new cranePuppetDraw();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(N, arr, moves));
    }
}
