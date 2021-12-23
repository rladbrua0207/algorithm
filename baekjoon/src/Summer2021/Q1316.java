package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			String str = br.readLine();
			String temp;
			
			String[] arr = str.split("");
			Loop1 :
			for(int j = 0; j < arr.length; j++) {
				if(arr.length == 1) {
					count ++;
					break;
				}
				if(j < arr.length-1) {
					if(arr[j].equals(arr[j+1])) {
						continue;
					}else {
						temp = arr[j];
						int k = j+1;
						for(;k < arr.length;++k) {
							if(temp.equals(arr[k])) {
								break Loop1;
							}
						}
					}
				}
				if(j == arr.length -1) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
