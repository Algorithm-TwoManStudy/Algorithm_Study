package kyunghun.set1.basic_math.p_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            int sum = 1;
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            sb.append(n + " = 1");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }
            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
            } else System.out.println(sb);
        }
    }
}
