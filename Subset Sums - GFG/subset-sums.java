// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        getSubsetSum(0 , N , arr ,new ArrayList<>() , ans);
        
        return ans;
    }
    
    
    public void getSubsetSum(int idx , int n , ArrayList<Integer> arr ,
                                ArrayList<Integer> ds , ArrayList<Integer> ans )
    {
        if(idx == n){
            int sum = 0;
            
            for(int e : ds){
                sum += e;
            }
            ans.add(sum);
            return;
        }
        
        ds.add(arr.get(idx));
        getSubsetSum(idx+1 , n , arr , ds , ans);
        ds.remove(ds.size()-1);
        getSubsetSum(idx+1 , n , arr , ds , ans);
    }
}