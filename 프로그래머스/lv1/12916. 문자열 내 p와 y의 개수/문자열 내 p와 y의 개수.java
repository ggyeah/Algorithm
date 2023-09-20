class Solution {
    boolean solution(String s) {
        boolean answer = true;
		int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
			char Word = s.charAt(i);
            if(Word == 'p'||Word == 'P'){
                p += 1;
            }else if(Word == 'y'||Word == 'Y'){
                y += 1;
            }
        }
		if (p!=y){
            answer = false;
        }
        
        return answer;
    }
}