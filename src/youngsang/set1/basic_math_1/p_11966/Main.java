package youngsang.set1.basic_math_1.p_11966;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N != 1) {
            if (N % 2 == 1) {
                System.out.println(0);
                return;
            }
            N = N / 2;      // 2의 거듭제곱을 확인하기 위해
        }
        System.out.println(1);
        sc.close();
    }
}
