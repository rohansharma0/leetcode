class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        int MOD = (int)(1e9 + 7);
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hMax = 0;
        
        for(int i = 0; i<=horizontalCuts.length ; i++){
            if(i == 0){
                hMax = Math.max(hMax , horizontalCuts[i]);
            }else if(i ==  horizontalCuts.length){
                hMax = Math.max(hMax , (h - horizontalCuts[i-1]));
            }else{
                hMax = Math.max(hMax , horizontalCuts[i] - horizontalCuts[i-1]);
            }
            
        }
        
        int wMax = 0;
        
        for(int i = 0; i<=verticalCuts.length ; i++){
            if(i == 0){
                wMax = Math.max(wMax , verticalCuts[i]);
            }else if(i ==  verticalCuts.length){
                wMax = Math.max(wMax , (w - verticalCuts[i-1]));
            }else{
                wMax = Math.max(wMax , verticalCuts[i] - verticalCuts[i-1]);
            }
        }
        
        long ans = 1L * hMax * wMax;
        
        return (int)(ans % MOD);
    }
}