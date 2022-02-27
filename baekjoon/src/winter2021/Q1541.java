package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] ch = str.toCharArray();
        ArrayList<String> arr = new ArrayList<String>();

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '-' && ch[i] != '+') {
                a.append(ch[i]);
            } else {
                arr.add(a.toString());
                arr.add(Character.toString(ch[i]));
                a = new StringBuilder();
            }
        }
        arr.add(a.toString());

        boolean isMinus = false;
        int answer = 0;
        for (String b : arr) {
            if (b.equals("-")) {
                isMinus = true;
            } else if (b.equals("+")) {
            } else {
                if (isMinus) {
                    answer = answer - Integer.parseInt(b);
                } else {
                    answer = answer + Integer.parseInt(b);
                }
            }
        }
        System.out.println(answer);
    }
}
