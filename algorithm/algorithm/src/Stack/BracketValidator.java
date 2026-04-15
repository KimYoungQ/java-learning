package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketValidator {

    public static boolean isValid(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;

                char open = stack.pop();

                if( c == ')' && open !='(') return false;
                if( c == '}' && open !='{') return false;
                if( c == ']' && open !='[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));   // true  ✅
        System.out.println(isValid("({[}])"));   // false ❌ - 순서가 잘못됨
        System.out.println(isValid("((())"));    // false ❌ - 여는 괄호가 남음
        System.out.println(isValid("(){}[]"));   // true  ✅
    }
}
