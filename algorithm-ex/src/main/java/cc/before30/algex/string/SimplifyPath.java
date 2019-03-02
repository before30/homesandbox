package cc.before30.algex.string;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {

    public String simplifyPath(String path) {

        String[] pathes = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < pathes.length; i++) {
            switch(pathes[i]) {
                case ".":
                    break;
                case "..":
                    if (stack.size() != 0) {
                        stack.pop();
                    }
                    break;
                case "":
                    break;
                default:
                    stack.push(pathes[i]);
                    break;
            }
        }

        String result = "";
        while (stack.size() != 0) {
            result += "/" + stack.pollLast();
        }

        return result == "" ? "/" : result;
    }

}
