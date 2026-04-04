import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] components = path.split("/");

        for (String dir : components) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else {
                stack.addLast(dir);
            }
        }

        StringJoiner sj = new StringJoiner("/", "/", "");
        for (String s : stack) {
            sj.add(s);
        }

        String result = sj.toString();
        return result.length() > 1 && result.endsWith("/") ? result.substring(0, result.length() - 1) : result;
    }
}
