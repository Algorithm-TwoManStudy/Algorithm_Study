package kyunghun.set1.basic_math.p_11966;

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
            N /= 2;
        }
        System.out.println(1);
    }
}
