package SlidingWindow;
//leetcode 1004
public class FlipNumMaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0}; int k=0;
        int  left =0,max =0;
        for(int right =0; right<nums.length; right++){
            if(nums[right]==0){
                k++;
            }
            while(k>2){
                if(nums[left]==0){
                    k--;
                }left++;
            }
            max=Math.max(max , right-left+1);
        }
        System.out.println(max);
    }
}
