package cc.before30.algex.general;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
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

        return list.stream().reduce(0, (o1, o2) -> o1 + o2);
    }
}
