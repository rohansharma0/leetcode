class Solution {
    public boolean parseBoolExpr(String ex) {
        
        Stack<Character> opt = new Stack<>();
        Stack<Character> opd = new Stack<>();
        
        for(char c : ex.toCharArray()){
            
            if(c == '!' || c == '|' || c == '&'){
                opt.push(c);
            }else if(c == 't' || c == 'f' || c == '('){
                opd.push(c);
            }else if(c == ')'){
                System.out.println(opt);              
                System.out.println(opd);

                char oprator = opt.pop();
                char res = opd.pop();
                
                if(oprator == '|'){
                    while(opd.size() > 0 && opd.peek() != '('){
                        res = parseOR(res , opd.pop());
                    }
                   
                }else if(oprator == '&'){
                    while(opd.size() > 0 && opd.peek() != '('){
                        res = parseAND(res , opd.pop());
                    }
                    
                }else if(oprator == '!'){
                    res = parseNOT(res);
                }
                opd.pop();
                opd.push(res);
                
            }
            
        }
        return opd.peek() == 't';
    }
    
    public char parseOR(char ch1 , char ch2){
        if(ch1 == 't' || ch2 == 't') return 't';
        return 'f';
    }
    
    public char parseAND(char ch1 , char ch2){
        if(ch1 == 't' && ch2 == 't') return 't';
        return 'f';
    }
    public char parseNOT(char c){
        if(c == 'f') return 't';
        return 'f';
    }
}