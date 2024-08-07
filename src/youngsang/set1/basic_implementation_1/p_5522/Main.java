package youngsang.set1.default_implementation_1.p_5522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            a += score;
        }
        System.out.println(a);


    }
}
