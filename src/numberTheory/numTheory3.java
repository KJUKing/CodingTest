package numberTheory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class numTheory3 {

    public static void main(String[] args) throws IOException {
        // Please Enter Your Code Here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        //소인수 분해 -Prime factorization
        //숫자 n을 소수의 곱으로 나타냄
        // n == 1 이면 끝난다.
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=2; n>1;) {
            if(n%i == 0) {
                System.out.println(i + " ");
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        for (Integer i : set) {
            list.add(i);
        }
        Collections.sort(list);

        int[] answer = new int[list.size() + 1];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.println("answer[i] = " + answer[i]);

        }

        /**
     공약수와 공배수 Common Divisor and Common Multiplier
        8, 36
            공약수
                1,2,4
            공배수
                72, 144 ..
            최대공약수 Greatest Common Divisor
                4
            최소공배수 Lower Common Multiplier
                72
    */


    }

    public int[] solution(int n) {
        int[] answer = {};
        for (int i=2; n>1;) {
            if(n%i == 0) {
                System.out.print(i + " ");
                n /= i;
            } else {
                i++;
            }
        }
        return answer;
    }
}

