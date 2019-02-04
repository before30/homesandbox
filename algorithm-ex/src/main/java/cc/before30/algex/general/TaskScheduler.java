package cc.before30.algex.general;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/task-scheduler/?fbclid=IwAR1oa44IgiJjMJSQnS-ANVNDVEdzH8mxzyuD473RspMB_izol3hLu9_8tZ8
 *
 * [개발자 매일 인터뷰 문제] 최신 기출문제 Top 139
 * Q #49. Task Scheduler
 * 댓글로 코드와 Big O (Time & Space)설명 달아 주시면 감사하겠습니다.
 * ---
 * Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks. Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.
 *
 * However, there is a non-negative cooling interval n that means between two same tasks, there must be at least n intervals that CPU are doing different tasks or just be idle.
 *
 * You need to return the least number of intervals the CPU will take to finish all the given tasks.
 *
 * Example:
 *
 * Input: tasks = ["A","A","A","B","B","B"], n = 2
 * Output: 8
 * Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
 *
 *
 * Note:
 *
 * The number of tasks is in the range [1, 10000].
 * The integer n is in the range [0, 100].
 */
public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> taskMap = new HashMap<>();
        for (int i=0; i<tasks.length; i++) {
            Integer count = taskMap.get(tasks[i]);
            if (count == null) {
                taskMap.put(tasks[i], 1);
            } else {
                taskMap.put(tasks[i], count + 1);
            }
        }

        int totalCount = tasks.length;

        while (totalCount > 0) {

        }
        return 0;
    }
}
