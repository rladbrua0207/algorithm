package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringFind {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		
		str = str.toLowerCase();
		char ch = br.readLine().charAt(0);
		if(ch < 91){
			ch = (char) (ch +' ');
		}
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
