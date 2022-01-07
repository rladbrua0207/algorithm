package SortingAndSearching_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class selectionSort {
    public int[] solution(int N, int[] arr) {
        int temp;
        for(int i = 0; i < N-1; i++){
        int minIndex = i;
            for(int j = i + 1; j < N; j++){
                if(arr[minIndex] > arr[j]) minIndex = j;
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        selectionSort T = new selectionSort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());;
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer = T.solution(N, arr);

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]+ " ");
        }
    }
}
