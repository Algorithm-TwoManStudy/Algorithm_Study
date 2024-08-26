package youngsang.set2.basic_implementation_2.p_4539;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            int m = 10;

            while (x >= m) {
                int r = x % m;
                x = (x / m) * m;
                if (r >= m / 2) {
                    x += m;
                }
                m *= 10;
            }

            System.out.println(x);
        }
        br.close();
    }
}

