class Solution {
    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int length = strN.length();
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++){
            answer[i] = strN.charAt(i) - '0'; 
        }
        
        for(int j = 0; j < length / 2; j++) {
            int temp = answer[j];
            answer[j] = answer[length - 1 -j];
            answer[length-1 - j] = temp;
        }
        return answer;
    }
}