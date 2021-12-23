package Summer2021;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char b = 'a';

		for(int i = 0 ; i <26 ; i++) {
			for(int j = 0; j < word.length(); j++) {
				if( b == word.charAt(j)) {
					System.out.print(word.indexOf(b)+" ");
					break;
				}else if(j == word.length()-1) {
					System.out.print(-1+" ");
				}
			}
			b++;
		}
	}
}
//baek joon