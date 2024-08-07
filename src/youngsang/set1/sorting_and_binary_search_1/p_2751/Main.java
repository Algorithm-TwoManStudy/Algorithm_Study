package youngsang.set1.sorting_and_binary_search_1.p_2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();     // 문자열을 만들기 위한 StringBuilder 객체 생성
        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);     // 오름차순으로 정렬

        for (int n : list) {        // 정렬된 각 정수를 StringBuilder에 추가하고 줄바꿈
            sb.append(n).append('\n');
        }
        System.out.println(sb);
    }
}
