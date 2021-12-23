package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	//�׽�Ʈ���̽�
		int count = n;
		StringTokenizer st = new StringTokenizer(br.readLine());

		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			if(value == 1) {
				count --;
			}
			for(int i = 2; i < value; i++) {
				if(value % i ==0) {		//value���� ���� ���� ������ �� ��������  0�� �Ǵ°�� : ����� �ִ°��
					count --;
					break;
				}
			}
		}
		System.out.println(count);
	}
}