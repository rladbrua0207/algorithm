package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()); 	
		int n = Integer.parseInt(st.nextToken());
		int a;
		int[] primeArr = new int[n+1];
		for(int i = 2; i < primeArr.length; i++) {
			primeArr[i] = i;
		}
		for(int i = 2;  i*i <= n; i++) {
			for(int j = i*2; j <= n; j+=i) {
				primeArr[j] = 0;
			}
		}
		for(int i = m; i < primeArr.length; i++) {
			if(primeArr[i] != 0) {
				System.out.println(primeArr[i]);
			}
		}
	}
}
