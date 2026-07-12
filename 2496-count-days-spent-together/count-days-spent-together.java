class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int Months[] = {0,31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int days[] = new int[366];
        int astart = Months[Integer.valueOf(arriveAlice.substring(0,2))-1] + Integer.valueOf(arriveAlice.substring(3));
        int aend = Months[Integer.valueOf(leaveAlice.substring(0,2))-1] + Integer.valueOf(leaveAlice.substring(3));
        int bstart = Months[Integer.valueOf(arriveBob.substring(0,2))-1] + Integer.valueOf(arriveBob.substring(3));
        int bend = Months[Integer.valueOf(leaveBob.substring(0,2))-1] + Integer.valueOf(leaveBob.substring(3));
        int amm = Math.max(astart,bstart);
        int lmm = Math.min(aend, bend);
        return amm>lmm?0:lmm-amm+1;
    }
}