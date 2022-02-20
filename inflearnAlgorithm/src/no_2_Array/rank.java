package no_2_Array;

import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t]; //점수
        int[] rank = new int[t];  //등수
        int count = 1;  //등수 더해줄 때 카운트
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < t; i++){
            if(arr[i] > max){ //최대값보다 입력값이 커졌을 때
                for(int j = i; j >=0; j--){
                    rank[j] += 1; //입력값보다 작은값들 +1
                }
                max = arr[i];
            }else if (arr[i] == max){ //최대값과 입력값이 같을때
                rank[i] ++;
                for(int j = i-1; j >=0; j--){ //최대값보다 작은값들 랭크 +1
                    if(arr[i] != arr[j]){
                        rank[j] += 1;
                    }
                }
            }else{ // 입력해준 값이 최대값보다 작을때
                for(int j = i-1; j >= 0; j--){
                    if(arr[i] < arr[j]){ // 입력값보다 큰수와 비교
                        count++;    //입력값보다 값이 크면 입력값 랭크+1
                    }else if(arr[i] == arr[j]){ // 입력값과 같을때 그냥 넘어가게
                    }else {     //입력값보다 작을때 비교값 랭크 +1
                        rank[j] += 1;
                    }
                }
                rank[i] = count;    //입력값 랭크 = count
                count = 1;  //다시 1로 초기화
            }
        }
        for(int i = 0; i < t; i++){
            System.out.print(rank[i] + " ");
        }
    }
}
