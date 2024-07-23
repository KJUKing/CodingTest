package numberTheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 파스칼의 삼각형
 n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.
 이 조합은 파스칼의 삼각형과 아주 밀접한 관련이 있다고 한다.
 n과 m이 주어졌을때 nCm의 값을 출력하는 프로그램을 작성하시오.
 */
public class numTheory5 {
    public static void main(String[] args) throws Exception {

        // Please Enter Your Code Here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n > 0) {
            // 파스칼 삼각형을 만든다.
            // 열의 개수는 다르다.
            int[][] pascal = new int[n+1][];

            // 파스칼 삼각형의 0행
            pascal[0]    = new int[1];
            pascal[0][0] = 1;
            // 파스칼 삼각형의 1행
            pascal[1]    = new int[2];
            pascal[1][0] = 1;
            pascal[1][1] = 1;

            for(int row = 2; row < n+1; row++) {
                pascal[row] = new int[row+1];
                // 파스칼 삼각형해서 처음과 끝은 항상 1이다.
                pascal[row][0]   = 1;
                pascal[row][row] = 1;
                // 중간의 값을 규칙에 맞게 채워 준다.
                for(int col = 1; col < row; col++) {
                    pascal[row][col] = pascal[row-1][col-1] + pascal[row-1][col];
                }
            }
            // 답
            System.out.println(pascal[n][m]);
        } else {
            System.out.println(1);
        }

    }
}
