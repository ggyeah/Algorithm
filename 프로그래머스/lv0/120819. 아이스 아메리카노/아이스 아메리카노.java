class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int one = money / 5500;
        int two = money % 5500;
        
        answer[0] = one;
        answer[1] = two;
        
        return answer;
    }
}