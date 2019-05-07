package cc.before30.algex.general;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mapping.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();

                if (topElement != mapping.get(c)) {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
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
