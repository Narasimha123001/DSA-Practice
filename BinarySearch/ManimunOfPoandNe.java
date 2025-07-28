package BinarySearch;
import java.util.*;
/* lletcode :2529
 * 
 * 
Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
Example 2:

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
Example 3:

Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 
 */
public class ManimunOfPoandNe {

    public static int maximumCount(int[] nums) {
        int left =0;
        int right = nums.length-1;
        int minele = 0;
        int maxlen =0;
        Arrays.sort(nums);
        while(left<=right){
            if(nums[left] < 0 && nums[left] != 0){
                minele++;
            }else if(nums[left] > 0 &&nums[left] != 0){
                maxlen++;
            }
            left++;
        }
        int maximum = Math.max(minele, maxlen);
        
        return maximum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(arr));
    }
}
