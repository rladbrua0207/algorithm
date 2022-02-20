package no_6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class doubleCheck_R {
    public char solution(int N, int[] arr) {
/*      //selectionSort
        int temp;
        int minIndex;
        for(int i = 0; i < N - 1; i++){
            minIndex = i;
            for(int j = i+1; j < N ;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }*/

/*      //bubbleSort
        int temp;
        for(int i = 1; i < N; i++){
            for(int j = 0; j < N - i; j++){
                if(arr[j] >arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/

/*      //insertionSort
        int temp;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] >= arr[j-1]){
                    break;
                }
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }*/


        for(int i = 0; i < N-1; i++) if(arr[i] == arr[i+1])  return 'D';
        return 'U';
    }

    public static void main(String[] args) throws IOException {
        doubleCheck_R T = new doubleCheck_R();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)  arr[i] = Integer.parseInt(st.nextToken());
        char answer = T.solution(N, arr);
        System.out.println(answer);
    }
}
