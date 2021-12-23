package Summer2021;

import java.util.*;

public class Q4673_fail {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		arr.add(10);
		arr.add(12);
		arr.add(14);
		arr.add(16);
		arr.add(18);

		
		
		selfNumber10("10", arr);
		selfNumber12("12", arr);
		selfNumber14("14", arr);
		selfNumber16("16", arr);
		selfNumber18("18", arr);
		
		HashSet<Integer> arr2 = new HashSet<Integer>(arr);
		int[] arr3 = new int[arr2.size()];
		ArrayList<Integer> arr4 = new ArrayList<Integer>(arr2);
		for(int i = 0; i < arr2.size(); i++) {
			arr3[i] = arr4.get(i);
		}		
		
		Arrays.sort(arr3);
		
		int[] arr5 = new int[10000];
		for(int i = 1; i <= 10000; i++) {
			arr5[i-1] = i;
		}
		
		for(int i = 0; i < arr3.length; i++) {
			//arr5[arr3[i]-1] = -1;
			
			
		}
		
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] > 0) {
				
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	public static int selfNumber10(String n, ArrayList<Integer> arr){
		String a[] = n.split("");
		int b;
		if(a.length == 2) {//두자리수
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}else if(a.length == 3) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}else if(a.length == 4) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2])+ Integer.parseInt(a[3]);
			if(b > 10000) {
				return 0;
			}
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}
		return 0 ;
	}
	public static int selfNumber12(String n, ArrayList<Integer> arr){
		String a[] = n.split("");
		int b;
		if(a.length == 2) {//두자리수
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
			arr.add(b);
			return selfNumber12(Integer.toString(b), arr);
		}else if(a.length == 3) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
			arr.add(b);
			return selfNumber12(Integer.toString(b), arr);
		}else if(a.length == 4) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2])+ Integer.parseInt(a[3]);
			if(b > 10000) {
				return 0;
			}
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}
		return 0 ;
	}
	public static int selfNumber14(String n, ArrayList<Integer> arr){
		String a[] = n.split("");
		int b;
		if(a.length == 2) {//두자리수
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
			arr.add(b);
			return selfNumber14(Integer.toString(b), arr);
		}else if(a.length == 3) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
			arr.add(b);
			return selfNumber14(Integer.toString(b), arr);
		}else if(a.length == 4) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2])+ Integer.parseInt(a[3]);
			if(b > 10000) {
				return 0;
			}
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}return 0 ;
	}
	public static int selfNumber16(String n, ArrayList<Integer> arr){
		String a[] = n.split("");
		int b;
		if(a.length == 2) {//두자리수
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
			arr.add(b);
			return selfNumber16(Integer.toString(b), arr);
		}else if(a.length == 3) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
			arr.add(b);
			return selfNumber16(Integer.toString(b), arr);
		}else if(a.length == 4) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2])+ Integer.parseInt(a[3]);
			if(b > 10000) {
				return 0;
			}
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}return 0 ;
	}
	public static int selfNumber18(String n, ArrayList<Integer> arr){
		String a[] = n.split("");
		int b;
		if(a.length == 2) {//두자리수
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
			arr.add(b);
			return selfNumber18(Integer.toString(b), arr);
		}else if(a.length == 3) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
			arr.add(b);
			return selfNumber18(Integer.toString(b), arr);
		}else if(a.length == 4) {
			b = Integer.parseInt(n) + Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2])+ Integer.parseInt(a[3]);
			if(b > 10000) {
				return 0;
			}
			arr.add(b);
			return selfNumber10(Integer.toString(b), arr);
		}return 0 ;
	}

}
