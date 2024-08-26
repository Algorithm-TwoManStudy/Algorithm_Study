package youngsang.set2.basic_implementation_2.p_9547;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int C = scanner.nextInt();
            int V = scanner.nextInt();

            int[][] arr = new int[V][C];
            int[] vote = new int[C + 1];
            int[] visit = new int[V];


            for (int i = 0; i < V; i++) {
                for (int j = 0; j < C; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < V; i++) {
                if (arr[i][0] != 0) {
                    vote[arr[i][0]]++;
                }
            }

            int mv = 0;
            int mc = 0;
            int sv = 0;
            int sc = 0;

            for (int i = 0; i <= C; i++) {
                if (vote[i] > mv) {
                    sv = mv;
                    sc = mc;
                    mv = vote[i];
                    mc = i;
                } else if (vote[i] > sv && i != mc) {
                    sv = vote[i];
                    sc = i;
                }
            }

            if (mv >= (double)V / 2) {
                System.out.println(mc + " 1");
            } else {

                for (int j = 1; j < C; j++) {
                    for (int k = 0; k < V; k++) {
                        if (arr[k][0] != mc && arr[k][0] != sc && visit[k] == 0) {
                            if (arr[k][j] == mc) {
                                mv++;
                                visit[k]++;
                            } else if (arr[k][j] == sc) {
                                sv++;
                                visit[k]++;
                            }
                        }
                    }
                }

                if (mv >= (double)V / 2) {
                    System.out.println(mc + " 2");
                } else if (sv >= (double)V / 2) {
                    System.out.println(sc + " 2");
                }
            }
        }

        scanner.close();
    }
}
