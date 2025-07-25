package SlidingWindow;

import java.util.HashSet;

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring
public class LongSubWithDiff{

    public static void main(String[] args) {
        String str = "abcabcbb";
        int n= str.length();
        int max=0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0 ; right< n; right++){
            char ch = str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max , right-left+1);
        }
        // for(int right=0 ; right< n ; right++){
        //     HashSet<Character> set = new HashSet<>();
        //     for (int left=right; left<n; left++){
        //         char ch = str.charAt(left);
        //         if(set.contains(ch)){
        //             break;
        //         }
        //         set.add(ch);
        //         max = Math.max(max, left-right+1);

                    
        //     }
                
        // }

        System.out.println(max);
      
        
    }
}
