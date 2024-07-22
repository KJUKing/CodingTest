package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
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
 * 이게 중요함
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
            if(arr[i] == 0) {                   // 0으로시작하는조건 1이면 건너띔 2의배수, 3의배수..등등
                System.out.print(i + " ");
                for(int j = i; j < n+1; j++) {
                    if(j%i == 0) {              // 만약 n값이 16이고 i가 2번째루프라면
                        arr[j] = 1;             // j는2부터시작 j는 16까지 반복
                    }                           // j는 증가하면서 i와 나머지계산해서 0나오면 1로채우기
                }                               // 미리 2의배수 3의배수.. 5의배수를 다채워놔서 더 검증필요없어짐
            }
        }

        //에라스토테네스의 체 개선버전
        int m = 10;
        boolean[] isPrimes = new boolean[m + 1];
        Arrays.fill(isPrimes, true);

        isPrimes[0] = false;
        isPrimes[1] = false;

        for ( int i = 2; i*i <= 10; ++i ) {
            if ( isPrimes[i] ) {
                for ( int j = i*i; j <= m; j+=i ) { //초기값이 2곱하기2부터시작 / j가 i의 배수대로 올라감
                    isPrimes[j] = false;
                }
            }
        }
    }

        public int solution(int n) {
        int answer = 0;
            boolean[] isPrime = new boolean[n+1];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;

            for (int i = 2; i*i <= n; i++) {
                if (isPrime[i]) {
                    System.out.print(i +" ");
                    for (int j = i*i; j <= n; j+=i) {
                        if (j % i == 0) {
                            isPrime[j] = false;
                        }
                    }

                }
            }


        return answer;
    }
}
//https://nahwasa.com/entry/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4-%ED%98%B9%EC%9D%80-%EC%86%8C%EC%88%98%ED%8C%90%EC%A0%95-%EC%8B%9C-%EC%A0%9C%EA%B3%B1%EA%B7%BC-%EA%B9%8C%EC%A7%80%EB%A7%8C-%ED%99%95%EC%9D%B8%ED%95%98%EB%A9%B4-%EB%90%98%EB%8A%94-%EC%9D%B4%EC%9C%A0
//에라토스테네스의 체 혹은 소수 판정시 제곱근까지만 확인하면 되는이유
/**
 * 흔히 에라토스테네스의 체를 사용해 n 이하의 모든 소수를 구하려고 할 때, 효율적으로 구하기 위해 n의 제곱근( sqrt(n) ) 까지만 확인하곤 한다.
 *   n 이하의 모든 소수를 구한다고 해보자. 이 때 해당 수 n은 자연수 a, b에 대해 n = a * b 라고 표현할 수 있다.
 * -> 예를들어 12는 2*6 혹은 3*4 등으로 나타낼 수 있다. a, b가 자연수라는 부분이 중요하다.
 *
 *   또 m = sqrt(n) 이라고 하면 n = m * m 이라고 할 수 있다.
 * -> 여기서 sqrt는 square root 즉 제곱근을 의미한다. 수식으로 나타내면 다들 알 것이다.
 *
 *   n = a*b이고, n = m*m 이라 했으므로 a*b = m*m 이다. (a,b는 자연수이고 m은 n의 제곱근)
 *  -> 그럼 이 상태에서 a랑 b가 자연수가 되려면 다음의 세가지 경우 중 하나만 가능하다.
 *
 * A. a=m 이고 b=m (n이 4와 같은 경우라서 m도 2처럼 자연수라면 가능하다.)
 * B. a<m 이고 b>m
 * C. a>m 이고 b<m
 *
 *   a, b가 자연수가 되려면 항상 위의 세가지 중 하나가 되고, 그렇다면 min(a, b) <= m 인것을 알 수 있다. (a와 b 중 작은 것은 m보다 작거나 같다.)
 *
 *   즉, n의 모든 약수에 해당하는 a와 b가 어떠한 약수이더라도 둘 중 하나는 무조건 m(=sqrt(n)) 이하 이므로, m까지만 조사한다면 n이 소수인지 알 수 있게 되는 것이다.
 *   그럼 이건 정확히 n에만 국한된 것이지, n 이하의 모든 수에 대해 만족하진 않는다고 생각할 수 있다.
 *   하지만 n보다 작은 것 중 가장 큰 수인 n-1만 해도 sqrt(n)>sqrt(n-1) 이다.
 *   즉 n보다 작은 수는 모두 sqrt(n) 내에 포함되므로 n 뿐만 아니라 n 미만의 모든 값에 대해 소수 판정이 가능하다.
 */

