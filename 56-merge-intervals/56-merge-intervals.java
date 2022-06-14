class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals , (a , b) -> (a[0] - b[0]));
        
        ArrayList<int[]> res = new ArrayList<>();
        
        int st = intervals[0][0];
        int et = intervals[0][1];
        
        for(int i = 1 ; i< intervals.length ; i++){
            int[] interval = intervals[i];
            
            if(interval[0] <= et){
                st = Math.min(st , interval[0]);
                et = Math.max(et , interval[1]);
            }else{
               res.add(new int[]{st , et});
                st = interval[0];
                et = interval[1];
            }
            
        }
        
        res.add(new int[]{st , et});
        
        int[][] ans = new int[res.size()][2];
        
        for(int i = 0 ; i< ans.length ; i++){
            ans[i] = res.get(i);
        }
        
        return ans;
    }
}