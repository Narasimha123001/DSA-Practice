package SlidingWindow;
//to find the max subArray k zeros
//1,1,0,1,0,0,0  k=2  output = 5
//ans: 1,1,1,1,1,0,0 k=5
//  1,1,0,1,0,1,1 k=2
// any two zero we can flip and change(2 chances) to 1 and max length

// import java.util.ArrayList;

public class MaxBinaryArray3 {

//here i want to pass the k = 1, next zero h=and find the highest max len in kth flip for
    public static int countZero(String arr){
        int maxLen =0; int k=1;
        
             int count =0,count1=0, left=0;
             for(int i=0 ; i< arr.length(); i++){
                if(arr.charAt(i)== '0'){
                    count++;
                }
                else{
                    count1++;
                }
                while(Math.min(count1, count)> k){
                    if(arr.charAt(left)=='0'){
                        count-=1;
                    }
                    else{
                        count1-=1;
                    }
                        left++;
                }
                
                maxLen = Math.max(maxLen, i-left+1);
            
        }  
        return maxLen;
    }
    public static void main(String[] args) {
        String ch = "11001";
        System.out.println(countZero(ch));
    }
}
