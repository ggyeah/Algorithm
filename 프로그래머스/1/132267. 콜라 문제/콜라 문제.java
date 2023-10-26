class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = 0;
    	int get = 0;
   		while (n >= a) { 
        	count = n / a;
       		get = count * b;
            answer += get;
        	n = n - (count * a) + get;
    	}
        return answer;
    }
}