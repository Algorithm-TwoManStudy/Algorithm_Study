package youngsang.set0.take_a_star.p_2442;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = i; j <= N - 1; j++)
                System.out.print(" ");
            for(int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}