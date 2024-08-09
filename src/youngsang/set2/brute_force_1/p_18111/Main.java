package youngsang.set2.brute_force_1.p_18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int min = 256;
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        int time = 99999999;
        int high = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            int block = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (i < arr[j][k]) {        // 지금 좌표의 층이 만들 층보다 높으면 제거하고, 블록은 제거한 만큼 추가하고, 시간은 두배
                        count += ((arr[j][k] - i) * 2);
                        block += (arr[j][k] - i);
                        }
                    else {      // 낮을 경우 블록은 제거, 시간은 1배
                        count += (i - arr[j][k]);
                        block -= (i - arr[j][k]);
                    }
                }
            }

            if (block < 0) {        // 블록의 개수가 음수가 되면 반복문 종료
                break;
            }
            if (time >= count) {
                time = count;
                high = i;
            }
        }
        System.out.println(time + " " + high);

    }
}
