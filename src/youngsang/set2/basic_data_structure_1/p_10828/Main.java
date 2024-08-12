package youngsang.set2.basic_data_structure_1.p_10828;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            String choice = sc.next();

            switch (choice) {
                case "push":                        // 스택 맨 위에 추가
                    stack.push(sc.nextInt());
                    break;

                case "pop":                         // 스택에서 데이터 삭제하고 반환
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');

                    } else {
                        sb.append(stack.pop()).append('\n');

                    }
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');       // 스택에 들어있는 정수 개수 출력

                    break;

                case "empty":
                    if(stack.isEmpty()) {               // 스택에 원소가 없으면 True, 있으면 False 값 반환
                        sb.append(1).append('\n');

                    }
                    else {
                        sb.append(0).append('\n');

                    }
                    break;

                case "top":                             // 스택 맨 위에 있는 데이터 값 반환
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');

                    }
                    else {
                        sb.append(stack.peek()).append('\n');       // 스택의 맨위 요소를 지우지 않고 반환

                    }
                    break;
            }
        }
        System.out.println(sb);
        sc.close();
    }
}

