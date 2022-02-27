package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Count {
    int zero;
    int one;
    Count(int zero, int one) {
        this.zero = zero;
        this.one = one;
    }
}

public class Q1003 {
    static Count[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        for (int i = 0; i < T; i++) {
            count = new Count[arr[i] + 1];
            for(int j = 0; j < count.length; j++){
                count[j] = new Count(0,0);
            }
            Count a = fibo(arr[i]);
            System.out.println(a.zero + " " + a.one);
        }

    }

    static Count fibo(int n) {
        if (count[n].one != 0 && count[n].zero != 0) {
            return count[n];
        }
        if (n == 0) {
            count[n].zero = 1;
            return count[n];
        } else if (n == 1) {
            count[n].one = 1;
            return count[n];
        } else {
            Count a = fibo(n - 1);
            Count b = fibo(n - 2);
            count[n].zero = a.zero + b.zero;
            count[n].one = a.one + b.one;
            return count[n];
        }
    }
}
