package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	//�׽�Ʈ���̽�

		int moveNum;	//�̵�Ƚ��
		int distance;	//�̵��Ÿ�
		int minSquare;	//���� ������
		int maxSquare;	//ū ������
		int dif;	//���� �������� �̵��Ÿ��� ����
		int[] save = new int[t];	//�� ����

		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); 	//�ʱ���ġ
			int y = Integer.parseInt(st.nextToken()); 	//������ġ
			
			distance = y - x;
			minSquare = (int) Math.sqrt(distance);
			maxSquare = (minSquare+1)*(minSquare+1);
			minSquare = minSquare*minSquare; // ���� ������
			dif= distance - minSquare; //���� ������ ���� ����
			
			//��Ģ���� ã�� ������ Ƚ�� ���ϴ� ����
			if(distance == minSquare) {
				moveNum = (int) Math.sqrt(minSquare)*2 -1;	
			}else if((maxSquare-minSquare-1)/2 < dif) {
				moveNum = (int) Math.sqrt(minSquare)*2 +1;
			}else {
				moveNum = (int) Math.sqrt(minSquare)*2;
			}
			save[i] = moveNum;
		}
		
		for(int i = 0 ; i < save.length; i++) {
			System.out.println(save[i]);
		}
	}
}
