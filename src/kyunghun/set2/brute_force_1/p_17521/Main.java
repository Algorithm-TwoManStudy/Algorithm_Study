package kyunghun.set2.brute_force.p_17521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long coin = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1] && w >= arr[i]) {
                coin = w / arr[i];
                w %= arr[i];
            } else if (arr[i] > arr[i + 1] && coin != 0) {
                w += coin * arr[i];
                coin = 0;
            }
        }
        w += coin * arr[n - 1];
        System.out.print(w);
    }
}