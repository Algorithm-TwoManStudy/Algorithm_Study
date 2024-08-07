package youngsang.set1.sorting_and_binary_search_1.p_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();         // 문자열을 만들기 위해서 StringBuilder 객체 생성함

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);       // 오름차순으로 정렬

        for (int i = 0; i < N; i++) {       // 정렬된 정수를 sb에 저장후 줄바꿈
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
