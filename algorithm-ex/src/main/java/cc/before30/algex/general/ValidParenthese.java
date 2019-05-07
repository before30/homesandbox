package cc.before30.algex.general;

import java.util.Stack;

public class ValidParenthese {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (stack.size() == 0 || '(' != stack.pop())
                        return false;
                    else
                        break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if (stack.size() == 0 || '[' != stack.pop())
                        return false;
                    else
                        break;
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if (stack.size() == 0 || '{' != stack.pop())
                        return false;
                    else
                        break;
            }
        }

        return stack.size() == 0;
    }
}
