class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        boolean merged = true;
        while (merged) {
            merged = false;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    int[] a = list.get(i);
                    int[] b = list.get(j);
                    if (Math.max(a[0], b[0]) <= Math.min(a[1], b[1])) {
                        list.set(i, new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])});
                        list.remove(j);
                        merged = true;
                        break;
                    }
                }
                if (merged) break;
            }
        }
        return list.toArray(new int[0][]);
    }
}
