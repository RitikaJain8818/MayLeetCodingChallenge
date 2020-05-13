class Solution {
    public String removeKdigits(String num, int k) {
        String ans=solve(num,k);
        //System.out.println(ans);
        if(ans.equals(""))
            return "0";
        
        int p=0;
        while(p<ans.length()&&ans.charAt(p)=='0'){
            ans=ans.substring(p+1);
            //System.out.println(ans);
        }
        if(ans.equals(""))
            return "0";
        
        return ans;
    }
    public String solve(String num,int k){
        if(k==0)
            return num;
        if(k==num.length())
            return "";
        int index=0;
        for(int i=1;i<=k;i++){
            if(num.charAt(i)<num.charAt(index)){
                index=i;
            }
        }
        return num.charAt(index)+solve(num.substring(index+1),k-index);
    }
}