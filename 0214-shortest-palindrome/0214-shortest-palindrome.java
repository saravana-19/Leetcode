class Solution {
    public boolean solve(String s)
    {
        String s1="";
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String shortestPalindrome(String s) 
    {
        String ans1="";
        for(int i=s.length()-1;i>=0;i--)
        {
         if(solve(s.substring(0,i+1)))
         {
            ans1=s.substring(0,i+1);
            break;
         }
        }
        int len=ans1.length();
        String ans2="";
        for(int i=s.length()-1;i>=len;i--)
        {
            ans2=ans2+s.charAt(i);
        }
        return ans2+s;
    }
}