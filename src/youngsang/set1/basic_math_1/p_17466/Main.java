package youngsang.set1.basic_math_1.p_17466;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();

        long result = 1;
        for (int i = 1; i <= N; i++) {
            result = (result * i) % P;
        }
        System.out.println(result);
        sc.close();
    }
}
