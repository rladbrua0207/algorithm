package Summer2021;

import java.util.Scanner;

public class Q1065_R {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		System.out.println(hanNum(input));
	}


	static int hanNum(int num) {
		int count = 0;

		if(num < 100) {
			return num;
		}else {
			count = 99;
			for(int i = 100; i <= num; i++) {
				int a = i / 100;
				int b = i / 10 % 10;
				int c = i % 10;
				if(b*2 == a+c) {
					count ++;
				}
			}
			return count;
		}
		
	}
}
