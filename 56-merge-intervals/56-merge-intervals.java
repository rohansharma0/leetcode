class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> res = new ArrayList<>();
        
        if(intervals.length == 0 || intervals == null){
            return res.toArray(new int[0][]);
        }
        
        Arrays.sort(intervals , (a , b) -> a[0] - b[0]);
        
        
        int st = intervals[0][0];
        int et = intervals[0][1];
        
        for(int[] interval : intervals){
            if(et >= interval[0]){
                et = Math.max(interval[1] , et);
            }else{
                res.add(new int[]{st , et});
                st = interval[0];
                et = interval[1];
            }
        }
        
        res.add(new int[]{st , et});
        
        return res.toArray(new int[0][]);
        
    }
}