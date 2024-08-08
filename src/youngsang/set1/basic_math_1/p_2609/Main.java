package youngsang.set1.basic_math_1.p_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int c = ab(a, b);

        System.out.println(c);
        System.out.println(a * b / c);

        br.close();

    }
    public static int ab(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ab(b, a % b);
    }
}
