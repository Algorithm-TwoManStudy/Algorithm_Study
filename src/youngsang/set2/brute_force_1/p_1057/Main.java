package youngsang.set2.brute_force_1.p_1057;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        int H = sc.nextInt();
        int count = 0;

        while(Z != H) {
            Z = Z / 2 + Z % 2;
            H = H / 2 + H % 2;
            count++;
        }
        System.out.println(count);
        sc.close();

    }
}