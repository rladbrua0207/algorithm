package SortingAndSearching_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class insertionSort {
    public int[] solution(int N, int[] arr) {
        int temp;

        for(int key = 1; key < N; key++) {
            for(int i = key; i > 0; i--){
                if(arr[i] < arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        insertionSort T = new insertionSort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer = T.solution(N, arr);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
