package kyunghun.set1.basic_math.p_17466;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long p = scanner.nextLong();

        long num = 1;

        for (int i = 2; i <= n; i++) {
            num = (num * i) % p;
        }

        System.out.println(num);
    }
}