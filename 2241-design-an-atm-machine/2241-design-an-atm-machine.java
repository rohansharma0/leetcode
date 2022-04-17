class ATM {
    long[] notes;
    HashMap<Integer , Integer> m;
    public ATM() {
        this.notes = new long[5];
        this.m = new HashMap<>();
        this.m.put(4 , 500);
        this.m.put(3 , 200);
        this.m.put(2 , 100);
        this.m.put(1 , 50);
        this.m.put(0 , 20);
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0 ; i < 5 ; i++){
            notes[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        
        int[] ans = new int[5];
        
        for(int i = 4 ; i>= 0 ; i--){
            
            if(amount >= m.get(i)){
                long c = amount / m.get(i);
                if(c > notes[i]) c = notes[i];
                notes[i] -= c;
                amount -= (c * m.get(i));
                ans[i] += c;
            }
            
        }
        if(amount == 0)  return ans;
        
        for(int i = 0 ; i< 5 ; i++){
            notes[i] += ans[i];

        }
        
        ans = new int[1];
        ans[0] = -1;
        return ans;
        
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */