package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://ttolkist.tistory.com/433
 * 에라토스테네스의 체 : 소수를 구하는 방법 중 하나
 * 배수를 제거하면서 소수를 구하는 방식
 * 1 2 3 4 5 6 7 8 9 10
 * 11 12 13 14 15 16 17 18 19 20
 * 21 22 23 24 25 26 27 28 29 30
 * 31 32 33 34 35 36 37 38 39 40
 * 41 42 43 44 45 46 47 48 49 50
 *
 * -> 1을 제외한 가장 작은 수 2를 선택 후 2는 소수라고 판정.
 * -> 2의 배수들은 모두 소수가 될 수 없으므로 제외
 * -> 그 다음 작은 수 3을 선택
 * -> 3의 배수들을 모두 소수가 될 수 없으므로 제외
 * -> 그 다음 작은 수 5를 선택
 * -> 5의 배수들을 모두 소수가 될 수 없으므로 제외
 * . . .
 *
 * **시간복잡도 : nlogn => 빠르다
 * - 1~n까지의 자연수 중 모든 소수를 구할 때 적합
 * - n이 소수인지를 판단할 때는 부적합
 */

public class numTheory2 {
    // Please Enter Your Code Here
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1]; //내가 배열을 선언하면 무조건 하나큰 수의 배열기입
        arr[0] = 1;
        arr[1] = 1;  //1번째와 2번째는 1값이 들어감
                     //0과 1값은 소수가 아니므로 포함하지않겠다는 의미
        for(int i = 0; i < n+1; i++) {
            if(arr[i] == 0) {
                System.out.print(i + " ");
                for(int j = i; j < n+1; j++) {
                    if(j%i == 0) {
                        arr[j] = 1;
                    }
                }
            }
        }
    }
}
