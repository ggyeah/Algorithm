class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
		long result = 0;
        
        if (count != 1) {
            for(int i = 1; i <= count; i++){
                result += (long)price * i;
            }
            answer = money - result;
        } 
        
        if(answer >= 0){
            return 0;
        } else {
        	return -answer;
        }
    }
}