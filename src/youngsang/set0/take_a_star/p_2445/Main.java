package youngsang.set0.take_a_star.p_2445;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //상단 별찍기
        for(int i = 1 ; i <= N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int k = 2 * N - i; k > 0; k--) {
                if(k > i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 하단 별찍기
        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j++) {
                System.out.print("*");
            }
            for(int k = 1; k < i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for(int h = N; h >= i; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
