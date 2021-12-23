package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		char[] ch = new char[str.length()+2];
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		int count = 0;
		for(int i = 0; i < str.length()+2; i++) {
			if(ch[i] == 0) {
				break;
			}
			if((ch[i]+""+ch[i+1]).equals('c'+""+'=') ) {
				i++;
				count ++;
			}else if((ch[i]+""+ch[i+1]).equals( 'c'+""+'-') ){
				i++;
				count ++;
			}else if((ch[i]+""+ch[i+1]+""+ch[i+2]).equals('d'+""+'z'+""+'=')) {
				i += 2;
				count ++;
			}else if((ch[i]+""+ch[i+1]).equals('d'+""+'-' )) {
				i++;
				count ++;
			}else if((ch[i]+""+ch[i+1]).equals('l'+""+'j') ) {
				i++;
				count ++;
			}else if((ch[i]+""+ch[i+1]).equals('n'+""+'j') ) {
				i++;
				count ++;
			}else if((ch[i]+""+ch[i+1]).equals('s'+""+'=')) {
				i++;
				count ++;
			}else if((ch[i]+""+ch[i+1]).equals( 'z'+""+'=') ) {
				i++;
				count ++;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}
