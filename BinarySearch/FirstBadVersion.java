package BinarySearch;
//leetcode - 278

/*
 * You are given an API bool isBadVersion(version) which returns whether version is bad. 
 * Implement a function to find the first bad version. You should minimize the number 
 * of calls to the API.
Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1
 */
public class FirstBadVersion {
    public static boolean isBad(int n){
        int[] nums = {0,0,0,0,0,1,1,1,1,1};
        if(nums[n]==1){
            return true;
        }
        return false;
    }
    public static int firstBadVer(int n){
        int left =1;
        int right = n;
        while(left<=right){
            int mid = left + (right -left)/2;
            if(isBad(mid)){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVer(10));
    }
}
