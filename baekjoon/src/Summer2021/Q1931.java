package Summer2021;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] start = new int[n];
        int[] end = new int[n];
        int[] startTemp = new int[n];
        int[] endTemp = new int[n];
        int count = 0;
        int k = 0;

        for(int i = 0; i < n; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken()); 
            startTemp[i] = start[i];
            endTemp[i] = end[i];
        }
        Arrays.sort(start);

        for(int i = 0; i < n; i++) {
            if(i != n-1) {
                if(start[i] == start[i+1]) {
                    count ++;
                    continue;
                }

                else if(count > 0) {
                    int[] arr = new int[count+1];
                    for(int j = 0; j < n; j++) {
                        if(start[i] == startTemp[j]) {
                            arr[k] = endTemp[j];
                            k++;
                        }
                    }
                    Arrays.sort(arr);
                    for(int p = count; p >= 0; p--) {
                        end[i-p] = arr[count-p];
                    }
                    k = 0;
                    count = 0;
                }else {
                    for(int j = 0; j < n; j++) {
                        if(start[i] == startTemp[j]) {
                            end[i] = endTemp[j];
                            break;
                        }
                    }
                }

            }
            else {
                for(int j = 0; j < n; j++) {
                    if(start[i] == startTemp[j]) {
                        end[i] = endTemp[j];
                        break;
                    }
                }
            }
        }
        int count2 = 0;
        int index = 0;
        
        Arrays.sort(endTemp);
        
        for(int i = 0; i < n; i++) {
            if(start[i] > endTemp[0]) {
                count2 += 2;
                index = i;
                break;
            }
        }
        
        for(int i = index; i < n; i++) {
            if(end[index] <= start[i]) {
                index = i;
                count2++;
            }
        }
        System.out.println(count2);
    }
}
/**  ????????
		int count2 = 0;
		int pivot = 0;

		for(int i = 0; i < n-1; i++) {
			if(end[pivot] <= start[i+1]) {
				pivot = i+1;
				System.out.println(start[pivot]);
				count2++;
			}else if(end[i+1] < end[pivot]) {
				pivot = i+1;
				System.out.println(start[pivot]);
			}
		}
				System.out.println(count2);

**/




/**?????????????? X
	//???????????? ??????
 	0 6    1 4  
    1 4    3 5 
	2 13   0 6 
	3 5    5 7
	3 8    3 8 
    5 7   6 10
	5 9   8 11
	6 10  8 12
	8 11  2 13
	8 12  12 14
	12 14  5 7
?????????? count ++
???? ???????? Sort ?? ????
 **/