package youngsang.set1.basic_math_1.p_17356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = 1 / (1 + Math.pow(10, (b - a) / 400.0));

        System.out.println(c);

        System.out.println();
        sc.close();
    }
}
