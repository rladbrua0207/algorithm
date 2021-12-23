package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()); 
		int count = 0;
		String[] arr = new String[t];
		
		for(int k = 0; k < t; k++) {
			int n = Integer.parseInt(br.readLine());
			int[] primeArr = new int[n+1];
			
			for(int i = 2; i < primeArr.length; i++) {
				primeArr[i] = i;
			}
			for(int i = 2;  i*i <= n; i++) {
				for(int j = i*2; j <= n; j+=i) {
					primeArr[j] = 0;
				}
			}
			
			loof:
			for(int i = n/2; i >= 2; i--) {
				for(int j = n/2; j <= n; j++) {
					if(primeArr[i] + primeArr[j] == n) {
						arr[count] = i + " " + j;
						count ++;
						break loof;
					}
				}
			}
			
		}
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}
}
