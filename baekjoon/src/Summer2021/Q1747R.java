package Summer2021;

import java.util.Scanner;

public class Q1747R {
    static int size = 10000001;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        isPrime(); //소수판별
        for (int i = n; i < size; i++) {
            if (isPelin(i) && arr[i] == 0) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void isPrime() {
        arr[1] = 1;
        for (int i = 2; (i * i) <= size - 1; i++) {
            if (arr[i] == 0) {
                for (int j = (i * i); j <= size - 1; j += i) {
                    arr[j] = 1;
                }
            }
        }
    }

    public static boolean isPelin(int n) {
        StringBuilder str = new StringBuilder();
        str.append(n);

        return str.toString().equals(str.reverse().toString());
    }
}

