package youngsang.set1.sorting_and_binary_search_1.p_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < arr[mid]) {   // 나눈 값이 작을때
                high = mid - 1;
            }
            else if (key > arr[mid]) {  // 나눈 값이 클때
                low = mid + 1;
            }
            else {      // 같으면
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);       // 정렬

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            if (binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append("\n");
            }
            else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
