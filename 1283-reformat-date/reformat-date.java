import java.util.*;

class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String dayStr = parts[0];
        String monthStr = parts[1];
        String year = parts[2];
        
        String day = dayStr.replaceAll("[a-z]", "");
        if (day.length() == 1) {
            day = "0" + day;
        }
        
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int monthIndex = 0;
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(monthStr)) {
                monthIndex = i + 1;
                break;
            }
        }
        
        String month = monthIndex < 10 ? "0" + monthIndex : String.valueOf(monthIndex);
        
        return year + "-" + month + "-" + day;
    }
}