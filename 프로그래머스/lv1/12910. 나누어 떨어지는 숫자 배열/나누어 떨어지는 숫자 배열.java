import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int result = 0;
        for(int num : arr){
            if(num % divisor == 0){
                answer.add(num);
            } else if(num % divisor != 0){
               result += 1;
            }
        }
        
        if(arr.length == result){
            answer.add(-1);
        }
        return answer;
    }
}