import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answerList = new ArrayList<>();

         for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                answerList.add(arr[i]);
            }
        }

        return answerList;
    }
}