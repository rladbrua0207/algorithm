package Summer2021;

import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count = 99;
		if(input < 100) {
			System.out.println(input);
		}else {
			for(int i = 100; i <= input; i++) {
				count += hanNum(i);
			}
			System.out.println(count);
		}
		
	}
	
	static int hanNum(int num) {

		int a = num / 100;
		int b = num / 10 % 10;
		int c = num % 10;
		
		if(2*b == a+c) {
			return 1;
		}else {
			return 0;
		}
	}
}
