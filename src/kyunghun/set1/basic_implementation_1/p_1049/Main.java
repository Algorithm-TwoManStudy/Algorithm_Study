package kyunghun.set1.basic_implementation_1.p_1049;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] set = new int[M];
        int[] each = new int[M];
        for (int i = 0; i < M; i++) {
            set[i] = sc.nextInt();
            each[i] = sc.nextInt();
        }
        Arrays.sort(set);
        Arrays.sort(each);

        int setSum = 0; // set 로만 구매
        int a = N;
        while (a >= -5) {
            setSum += set[0];
            a -= 6;
        }

        int eachSum = 0; // each 로만 구매
        int b = N;
        while (b > 0) {
            eachSum += each[0];
            b -= 1;
        }

        int mixSum = 0; // set와 each 섞어서 구매
        int c = N;
        while (c >= 6) {
            mixSum += set[0];
            c -= 6;
        }
        if (mixSum + set[0] < each[0] * N) {
            mixSum += set[0];
        } else {
            while (c > 0) {
                mixSum += each[0];
                c -= 1;
            }
        }

        int min = Math.min(setSum, Math.min(eachSum, mixSum));
        System.out.println(min);
    }
}
