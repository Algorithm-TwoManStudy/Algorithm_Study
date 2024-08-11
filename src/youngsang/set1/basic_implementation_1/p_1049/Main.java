package youngsang.set1.basic_implementation_1.p_1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 기타줄의 개수 N
        int M = sc.nextInt();       // 기타줄 브랜드의 수 M
        int minPack = Integer.MAX_VALUE;        // 패키지 각겨의 최소값을 저장할 변수
        int minUnit = Integer.MAX_VALUE;        // 단가의 최소값을 젖아할 변수

        for(int i = 0; i < M; i++){
            int pack = sc.nextInt();        // 각 브랜드의 패키지 가격 입력
            int unit = sc.nextInt();        // 각 브랜드의 단가 입력

            if(pack < minPack) {        // 최소 패키지 가격 갱신
                minPack = pack;
            }
            if(unit < minUnit) {        // 최소 단가 갱신
                minUnit = unit;
            }
        }

                    // 패키지를 한 세트 더 구매하는 경우      // 모든 기타줄을 단가로만 구매하는 경우
        int mins = Math.min(((N / 6) + 1) * minPack, N * minUnit);
        mins = Math.min(mins, ((N / 6)) * minPack + (N % 6) * minUnit); // 패키지와 단가를 혼합하여 구매하는 경우

        System.out.println(mins);
        sc.close();
    }
}
