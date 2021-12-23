package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] smallNum = new int[n];
		int count = 0;
		
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				smallNum[count] = i;
				n = n/i;
				i = 1;
				System.out.println(smallNum[count]);
				count++;
			}
			
		}
		
	}
}
