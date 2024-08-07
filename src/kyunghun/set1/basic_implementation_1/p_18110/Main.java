package kyunghun.set1.basic_implementation_1.p_18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int trim = (int) Math.round(n * 0.15);

        double sum = 0;
        for (int i = trim; i < n - trim; i++) {
            sum += arr[i];
        }

        int avg = (int) Math.round(sum / (n - trim * 2));
        System.out.print(avg);
    }
}
