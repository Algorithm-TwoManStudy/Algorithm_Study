package kyunghun.set2.brute_force_1.p_10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int MAX = Integer.MIN_VALUE;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        selected = new int[N];
        visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(MAX);
    }

    static void dfs(int count) {
        if (count == N) {
            MAX = Math.max(MAX, getSum());
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[count] = arr[i];
                dfs(count + 1);
                visited[i] = false;
            }
        }
    }

    static int getSum() {
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            sum += Math.abs(selected[i] - selected[i + 1]);
        }

        return sum;
    }
}