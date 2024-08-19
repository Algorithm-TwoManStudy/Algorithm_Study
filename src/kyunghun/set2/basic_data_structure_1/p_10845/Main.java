package kyunghun.set2.basic_data_structure_1.p_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 첫 번째 토큰을 저장

            if ("push".equals(command)) {
                last = Integer.parseInt(st.nextToken());
                q.add(last);
            } else if ("pop".equals(command)) {
                System.out.println(q.isEmpty() ? -1 : q.remove());
            } else if ("size".equals(command)) {
                System.out.println(q.size());
            } else if ("empty".equals(command)) {
                System.out.println(q.isEmpty() ? 1 : 0);
            } else if ("front".equals(command)) {
                System.out.println(q.isEmpty() ? -1 : q.peek());
            } else if ("back".equals(command)) {
                System.out.println(q.isEmpty() ? -1 : last);
            }
        }
        br.close();
    }
}
