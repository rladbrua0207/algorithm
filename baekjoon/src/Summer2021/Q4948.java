package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();	
		
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			if(n == 0) {
				break;
			}
			int[] primeArr = new int[2*n+1];
			for(int i = 2; i < primeArr.length; i++) {
				primeArr[i] = i;
			}
			for(int i = 2;  i*i <= 2*n; i++) {
				for(int j = i*2; j <= 2*n; j+=i) {
					primeArr[j] = 0;
				}
			}
			for(int i = n+1; i < primeArr.length; i++) {
				if(primeArr[i] != 0) {
					count ++;
				}
			}
			arr.add(count);
		}
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));;
		}
	}
}
