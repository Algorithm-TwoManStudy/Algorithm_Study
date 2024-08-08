package youngsang.set1.basic_math_1.p_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {      // 입력자가 -1을 입력하기전까지 계속 실행
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            StringBuilder sb = new StringBuilder();     // sb를 사용해서 출력 문자열을 생성한다.
            sb.append(n);
            if (sum == n) {
                sb.append(" = ");

            for (int a : list) {    // 완전수인 경우
                sb.append(a).append(" + ");     // 모든 약수들의 출력 문자열에 추가한다.
            }

            sb.delete(sb.length() - 3, sb.length());
            } else {
                sb.append(" is NOT perfect.");
            }
            System.out.println(sb);

        }
        br.close();

    }
}
