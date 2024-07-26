package stackAndQueue;

/**
 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는
 모두 VPS 가 아닌 문자열이다.

 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class StackTest02_VPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            boolean isVPS;
            ArrayList<Character> list = new ArrayList<>();

            for (int j = 0; j < input.length(); j++) {
                list.add(input.charAt(j));
            }
            isVPS = searchVPS(list);

            if (isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static  boolean searchVPS(ArrayList<Character> list) {
        Stack<Character> stack = new Stack<>();
//        if (!(list.getFirst().equals(')')))
            for (int j = 0; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    if (list.get(j) == '(' && list.get(k) == ')') {
                        list.set(j, '0');
                        list.set(k, '0');
                        break;
                    }
                }
            }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '(' || list.get(i) == ')') {
                return false;
            }
        }
        return true;
    }


}

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push(c);

                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;

                    } else {
                        if (c == ')') {
                            stack.pop();

                        }
                    }
                }

            }

            if (!stack.isEmpty()) {
                isVPS = false;

            }

            System.out.println(isVPS ? "YES" : "NO");
        }
    }

 */
