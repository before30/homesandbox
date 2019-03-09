package cc.before30.algex.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {
    public int calPoints2(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "+":
                    int top = stack.pop();
                    int newtop = top + stack.peek();
                    stack.push(top);
                    stack.push(newtop);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                default:
                    stack.push(Integer.valueOf(op));
                    break;
            }
        }
        int ans = 0;
        for (int score : stack) {
            ans += score;
        }

        return ans;
    }


    public int calPoints(String[] ops) {

        List<Integer> list = new ArrayList<>();
        int idx = 0;

        for (String op : ops) {
            switch (op) {
                case "+":
                    list.add(list.get(idx-1) + list.get(idx-2));
                    idx++;
                    break;
                case "C":
                    list.remove(idx-1);
                    idx--;
                    break;
                case "D":
                    list.add(list.get(idx-1) * 2);
                    idx++;
                    break;
                default:
                    list.add(Integer.valueOf(op));
                    idx++;
                    break;
            }
        }


        int ans = 0;
        for (int score : list) {
            ans += score;
        }

        return ans;
    }
}
