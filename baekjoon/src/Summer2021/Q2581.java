package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.parseInt(br.readLine());	//테스트케이스
		int max = Integer.parseInt(br.readLine());

		int[] arr = new int[max-min+1];
		int[] prime = new int[max-min+1];
		int sum = 0;
		int minValue = 0;
		int count = 0;

		for(int i = min; i <= max; i++) {
			if(i == 1) {
				arr[0] = 1;
				continue;
			}else if(i ==2) {
				continue;
			}
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					arr[i-min] = i;  //소수가 아닌것
					break;
				}
			}

		}
		for(int i = min; i <= max; i++) {
			prime[i-min] = i;
		}

		for(int i = 0; i <= max-min; i++) {
			for(int j = 0; j <= max-min; j++) {
				if(prime[i] == arr[j]) {
					prime[i] = 0;
					break;
				}
			}
		}
		for(int i = 0; i <= max-min; i++) {
			sum += prime[i];
			if(prime[i] != 0 && count == 0) {
				minValue = prime[i];
				count ++;
			}
		}

		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(minValue);
		}
	}
}

