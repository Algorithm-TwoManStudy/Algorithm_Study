package kyunghun.set2.basic_data_structure_1.p_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 첫 번째 토큰을 저장

            if ("push".equals(command)) {
                s.push(Integer.parseInt(st.nextToken()));
            } else if ("pop".equals(command)) {
                System.out.println(s.empty() ? -1 : s.pop());
            } else if ("size".equals(command)) {
                System.out.println(s.size());
            } else if ("empty".equals(command)) {
                System.out.println(s.empty() ? 1 : 0);
            } else if ("top".equals(command)) {
                System.out.println(s.empty() ? -1 : s.peek());
            }
        }
        br.close();
    }
}

