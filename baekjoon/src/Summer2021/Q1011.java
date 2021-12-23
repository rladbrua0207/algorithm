package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	//테스트케이스

		int moveNum;	//이동횟수
		int distance;	//이동거리
		int minSquare;	//작은 제곱수
		int maxSquare;	//큰 제곱수
		int dif;	//작은 제곱수와 이동거리의 차이
		int[] save = new int[t];	//값 저장

		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); 	//초기위치
			int y = Integer.parseInt(st.nextToken()); 	//나중위치
			
			distance = y - x;
			minSquare = (int) Math.sqrt(distance);
			maxSquare = (minSquare+1)*(minSquare+1);
			minSquare = minSquare*minSquare; // 작은 제곱수
			dif= distance - minSquare; //작은 제곱수 와의 차이
			
			//규칙에서 찾은 움직인 횟수 구하는 공식
			if(distance == minSquare) {
				moveNum = (int) Math.sqrt(minSquare)*2 -1;	
			}else if((maxSquare-minSquare-1)/2 < dif) {
				moveNum = (int) Math.sqrt(minSquare)*2 +1;
			}else {
				moveNum = (int) Math.sqrt(minSquare)*2;
			}
			save[i] = moveNum;
		}
		
		for(int i = 0 ; i < save.length; i++) {
			System.out.println(save[i]);
		}
	}
}
