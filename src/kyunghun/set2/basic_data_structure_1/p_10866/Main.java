package kyunghun.set2.basic_data_structure_1.p_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> d = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 첫 번째 토큰을 저장

            if ("push_front".equals(command)) {
                d.addFirst(Integer.parseInt(st.nextToken()));
            } else if ("push_back".equals(command)) {
                d.addLast(Integer.parseInt(st.nextToken()));
            } else if ("pop_front".equals(command)) {
                System.out.println(d.isEmpty() ? -1 : d.removeFirst());
            } else if ("pop_back".equals(command)) {
                System.out.println(d.isEmpty() ? -1 : d.removeLast());
            } else if ("size".equals(command)) {
                System.out.println(d.size());
            } else if ("empty".equals(command)) {
                System.out.println(d.isEmpty() ? 1 : 0);
            } else if ("front".equals(command)) {
                System.out.println(d.isEmpty() ? -1 : d.getFirst());
            } else if ("back".equals(command)) {
                System.out.println(d.isEmpty() ? -1 : d.getLast());
            }
        }
        br.close();
    }
}
