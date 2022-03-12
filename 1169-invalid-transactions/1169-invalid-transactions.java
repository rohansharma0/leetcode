class Solution {
    public List<String> invalidTransactions(String[] arr) {
        
        List<String> ans = new ArrayList<>();
        
        int n = arr.length;
        
        for(int i = 0; i< n ; i++){
            
            String[] tra1 = arr[i].split(",");
            String n1 = tra1[0];
            Integer t1 = Integer.parseInt(tra1[1]);
            Integer a1 = Integer.parseInt(tra1[2]);
            String c1 = tra1[3];
            
            
            for(int j = 0 ; j< n ; j++){
                
                if(i == j) continue;
                
                String[] tra2 = arr[j].split(",");
                String n2 = tra2[0];
                Integer t2 = Integer.parseInt(tra2[1]);
                Integer a2 = Integer.parseInt(tra2[2]);
                String c2 = tra2[3];

                if(n1.equals(n2) && Math.abs(t1 - t2) <= 60 && !c1.equals(c2)){
                    ans.add(arr[i]);
                    break;
                }else if(a1 > 1000){
                    ans.add(arr[i]);
                    break;
                }
                    
            }
        }
        
        return ans;
        
    }
}