class Solution {
    public String interpret(String command) {
        StringBuilder a = new StringBuilder();
        int b = command.length();
        for (int c = 0; c < b; c++) {
            if (command.charAt(c) == 'G') {
                a.append('G');
            } else if (command.charAt(c) == '(') {
                if (command.charAt(c + 1) == ')') {
                    a.append('o');
                    c++;
                } else {
                    a.append("al");
                    c += 3;
                }
            }
        }
        return a.toString();
    }
}
