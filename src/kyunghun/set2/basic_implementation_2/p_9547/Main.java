package kyunghun.set2.basic_implementation_2.p_9547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int k = 0; k < T; k++) {
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int[][] arr = new int[V][C];
            int[] count = new int[C + 1];

            for (int i = 0; i < V; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < C; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < V; i++) {
                count[arr[i][0]]++;
            }

            int majority = (V / 2) + 1;
            int first = 0, second = 0;

            for (int i = 1; i <= C; i++) {
                if (count[i] >= majority) {
                    System.out.println(i + " " + 1);
                    first = -1;
                    break;
                }
                if (count[i] > count[first]) {
                    second = first;
                    first = i;
                } else if (count[i] > count[second]) {
                    second = i;
                }
            }

            if (first != -1) {
                count = new int[C + 1];

                for (int i = 0; i < V; i++) {
                    for (int j = 0; j < C; j++) {
                        if (arr[i][j] == first || arr[i][j] == second) {
                            count[arr[i][j]]++;
                            break;
                        }
                    }
                }

                if (count[first] > count[second]) {
                    System.out.println(first + " " + 2);
                } else {
                    System.out.println(second + " " + 2);
                }
            }
        }
    }
}

