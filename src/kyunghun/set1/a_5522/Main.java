package kyunghun.set1.a_5522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println(sum);
    }
}
