package String;

class Solution {
   
    
    public boolean isPalindrome(int n) {
        int original =n;
         int res = 0;
    while(n>0){
        int digit = n%10;
        res = res *10 +digit;
        n = n/10;
    } if(original == res){
        System.out.println("Yes");
        return true;
    }else{
         System.out.println("No");
         return false;
    }
    }
    
    public static void main(String[] args){
        Solution obj1 = new Solution();
        obj1. isPalindrome(12521);
    }
}