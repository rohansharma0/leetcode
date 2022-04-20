class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals , (a , b) -> (a[0] - b[0]));
        
        int i = 0;
        int j = 1;
        int c = 0;
        while(j < intervals.length){
            if(intervals[i][1] <= intervals[j][0]){
                i = j;
                j++;
            }else if(intervals[i][1] <= intervals[j][1]){
                c++;
                j++;
            }else if(intervals[i][1] > intervals[j][1]){
                c++;
                i = j;
                j++;
            }
        }
        
        return c;
    }
}