package kyunghun.set2.brute_force_1.p_18111;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, b;
    static int[][] map;
    static int max = Integer.MIN_VALUE; // 입력된 블록들 중 가장 높은 높이
    static int min = Integer.MAX_VALUE; // 입력된 블록들 중 가장 낮은 높이
    static int time = Integer.MAX_VALUE; // 땅을 고르게 하는 데 걸리는 최소 시간
    static int height = 0; // 땅을 고르게 한 후의 가장 높은 층수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 값 입력
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                // 최대 층수 찾기
                max = Math.max(map[i][j], max);
                // 최소 층수 찾기
                min = Math.min(min, map[i][j]);
            }
        }

        // 땅을 고를 때 최저 층수와 최고 층수 사이 값으로 되므로 이 값 사이를 반복으로 돌리면 된다.
        for (int k = max; k >= min; k--) {
            int t = 0; // 블록을 넣고 뺄 때 걸리는 시간
            int item = b; // 블록을 고르게 할 때 남은 총 아이템 양

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 층수를 초과했다 보여면
                    if (map[i][j] > k) {
                        // 블록을 제거해서 인벤토리에 넣기
                        // 블록을 제거할 때 걸리는 시간은 2초
                        item += (map[i][j] - k);
                        t += 2 * (map[i][j] - k);
                    }
                    // 층수가 낮다면
                    else if (map[i][j] < k) {
                        // 인벤토리에서 블록을 꺼내기
                        // 블록을 고르게 할 때 걸리는 시간은 1초
                        item -= (k - map[i][j]);
                        t += (k - map[i][j]);
                    }
                }
            }

            // 연산을 탐색하고 있기 때문에
            // 시간과 높이 경우는 남아있는 블록도 처리하면서
            // 시간이 같을 때 이상일 경우 더 높은 층수를 출력하는 조건 무시
            // 시간이 같지 않더라도 연산이 잘못된 경우를 높이 경우에 더 높은 블록을 출력할 수 있다는 뜻
            if (item >= 0 && t <= time) {
                height = k; // 층수 갱신
                time = t; // 시간 갱신
            }
        }

        System.out.println(time + " " + height);
    }
}