package String_1;

import java.io.*;

public class reverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String str = br.readLine();
            for(int j = str.length()-1 ; j >= 0; j--){
                bw.append(str.charAt(j));
            }
            bw.append("\n");
            bw.flush();
        }

        bw.close();
    }
}
