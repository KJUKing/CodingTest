package numberTheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 유클리드 호제법 : 최대공약수를 구하기 위한 알고리즘
 152 68 의 최대 공약수를 구하는 원리.

 a         b         r(a를 b로 나눈 나머지)
 152       68        20
 68        20        8
 20         8        4
 8          4        0
 => 4가 최대 공약수이다.
 */

public class numTheory4 {
    public static void main(String[] args) throws Exception {

//        // Please Enter Your Code Here
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int A, B; // 최소공배수 구할 때 사용할 원본
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        A = a;
//        B = b;
//
//        int GCD = -1; // 최대공약수
//        int LCM = -1; // 최소공배수
//
//        while(true) {
//            int r = a % b;
//            if(r == 0) {
//                // 최대공약수
//                GCD = b;
//                break;
//            }
//
//            a = b;
//            b = r;
//        }
//        // 최소공배수
//        LCM = (A / GCD) * (B / GCD) * GCD;
//
//        System.out.println(GCD + " " + LCM);

    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a, b;
        a =n;
        b =m;
        int GCD = -1; // 최대공약수
        int LCM = -1; // 최소공배수

        while (true) {
            int r = n % m;
            if (r == 0) {
                GCD = m; //최대공약수
                break;
            }
            n = m;
            m = r;
        }

        //최소공배수
        LCM = (a/GCD) * (b/GCD) * GCD;

        answer[0] = GCD;
        answer[1] = LCM;

        return answer;
    }
}