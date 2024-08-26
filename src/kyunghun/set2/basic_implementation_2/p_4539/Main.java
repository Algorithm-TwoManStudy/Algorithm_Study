package kyunghun.set2.basic_implementation_2.p_4539;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x > 10) {
                x = ((x + 5) / 10) * 10;
            }  if (x > 100) {
                x = ((x + 50) / 100) * 100;
            }  if (x > 1000) {
                x = ((x + 500) / 1000) * 1000;
            }  if (x > 10000) {
                x = ((x + 5000) / 10000) * 10000;
            }  if (x > 100000) {
                x = ((x + 50000) / 100000) * 100000;
            }  if (x > 1000000) {
                x = ((x + 500000) / 1000000) * 1000000;
            }  if (x > 10000000) {
                x = ((x + 5000000) / 10000000) * 10000000;
            }

            System.out.println(x);
        }
    }
}
