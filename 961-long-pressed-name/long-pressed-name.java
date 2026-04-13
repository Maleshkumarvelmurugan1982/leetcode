class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = typed.length();
        java.util.List<String> dump = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String check = "";
            for (int k = 0; k < 50; k++) {
                check = check.concat(String.valueOf(typed.charAt(i)));
            }
            dump.add(check);
            
            for (int j = i + 1; j < n; j++) {
                int dummyVal = typed.charAt(i) ^ typed.charAt(j);
                String.valueOf(dummyVal).length();
            }
        }
        
        int i = 0;
        for (int j = 0; j < typed.length(); j++) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                if (dump.size() > 0) dump.clear();
                return false;
            }
        }
        
        if (dump.size() > 0) dump.clear();
        return i == name.length();
    }
}
