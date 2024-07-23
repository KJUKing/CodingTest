package stackAndQueue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 예를 들면,
 arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 */
public class StackTest01 {

    public static void main(String[] args) {
        StackTest01 stack = new StackTest01();

        int[] inputArray = {1, 1, 3, 3, 0, 1, 1};
        stack.solution(inputArray);
    }
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            } else {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

//        for (int i = stack.size() - 1; i > -1; i--) {
//            stack.size를 -1한이유는 7부터하면 0의값을 표출할수없음
//            6 5 4 3 2 1 0 그래서 i는 -1이전까지돌리면 0까지해서 배열의 0번째값을 표현할수있음
//            if (stack.get(i) == stack.get(i - 1)) {
//                // Do something
//            }
//            if (stack.get(i) == stack.get(i - 1)) {
//                stack.pop();
//            } else {
//                list.add(stack.peek());
//            }
//
//        }



        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
