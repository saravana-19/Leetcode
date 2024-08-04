class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int i,j;
        int [] suffix=new int[n];
        suffix[n-1]=prices[n-1];
        for(i=n-2;i>=0;i--){
            if(suffix[i+1]>prices[i]){
                suffix[i]=suffix[i+1];
            }
            else{
                suffix[i]=prices[i];
            }
        }
        for(i=0;i<=n-1;i++){
            if(max<(suffix[i]-prices[i])){
                max=suffix[i]-prices[i];           }
        }
       return max; 
    }
}