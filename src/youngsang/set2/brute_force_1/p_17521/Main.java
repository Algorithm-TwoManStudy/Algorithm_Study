package youngsang.set2.brute_force_1.p_17521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long W = Long.parseLong(st.nextToken());        // 초기 자본

        int[] price = new int[n];
        for (int i = 0; i < n; i++) {       // 각 날짜 주식가격을 배열에 저장함.
            price[i] = Integer.parseInt(br.readLine());

        }
        long coin = 0;

        for (int i = 0; i < n - 1; i++) {   // 주식이 싸고, 구매할 수 있으면 사고
            if (price[i] < price[i + 1] && W >= price[i]) {
                coin += (W / price[i]);
                W %= price[i];
            }
            else if (price[i] > price[i + 1] && coin != 0) {    // 주식이 비싸고 보유한 주식을 팔 때
                W += (coin * price[i]);     // 주식을 팔아서 돈으로 바꿈
                coin = 0;       // 가지고 있는 주식 초기화
            }
        }
        W = W + coin * price[n - 1];        // 마지막 날 주식가격으로 남은 주식 판매
        System.out.println(W);
        br.close();
    }
}
