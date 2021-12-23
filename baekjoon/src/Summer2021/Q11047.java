package Summer2021;

import java.util.Scanner;

public class Q11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = n-1; i >= 0; i--) {
			if(k/num[i] >= 1) {
				count += k/num[i];
				k = k % num[i];
			}
		}
		System.out.println(count);
	}
}
