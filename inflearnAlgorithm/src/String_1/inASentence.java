package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inASentence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] arrStr = new String[str.split(" ").length];
		int len = 0, pos;
		int index = 0;
	//	while(pos=str.indexOf(" ")) {
	//
	//	}
		arrStr = str.split(" ");
		
		for(int i = 0; i < arrStr.length; i++) {
			if(arrStr[i].length() > len) {
				len = arrStr[i].length();
				index = i;
			}
		}
		System.out.println(arrStr[index]);
	}
}
