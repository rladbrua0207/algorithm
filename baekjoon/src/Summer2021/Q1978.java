package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	//테스트케이스
		int count = n;
		StringTokenizer st = new StringTokenizer(br.readLine());

		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			if(value == 1) {
				count --;
			}
			for(int i = 2; i < value; i++) {
				if(value % i ==0) {		//value보다 작은 수로 나눴을 때 나머지가  0이 되는경우 : 약수가 있는경우
					count --;
					break;
				}
			}
		}
		System.out.println(count);
	}
}