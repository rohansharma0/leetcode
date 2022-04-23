class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                for(int i = s.length() -1 ; i>= 0 ; i--){
                    if(s.charAt(i) == c){
                        map.put(c , i);
                        break;
                    }
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        int st = 0;
        int et = 0;
        
        for(int i = 0 ; i< s.length() ; i++){
            et = Math.max(et , map.get(s.charAt(i)));
            if(i == et){
                ans.add(et - st+1);
                st = et+1;
            }
        }
        
        return ans;
    }
}