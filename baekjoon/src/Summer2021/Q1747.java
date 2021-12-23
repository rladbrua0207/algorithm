package Summer2021;

import java.util.Scanner;

public class Q1747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int size = 10000001;
        int[] arr = new int[size];
        String str;
        arr[1] = 1;
        for(int i = 2; (i * i)<= size-1; i ++){
            if(arr[i] == 0){
                for(int j = (i * i); j <= size-1; j += i){
                    arr[j] = 1;
                }
            }
        }

        loop:
        for(int i = n; i < size; i++){
            if(arr[i] == 0){
                str = Integer.toString(i);
                char[] ch = str.toCharArray();
                int lt = 0;
                int rt = ch.length-1;
                while(lt <= rt){
                    if(ch[lt] != ch[rt]){
                        break;
                    }else{
                        lt++;
                        rt--;
                    }
                    if(lt >= rt){
                        System.out.println(i);
                        break loop;
                    }
                }
            }
        }
    }
}
