class Solution {
    public String solution(String s) {
       String answer = "";
       int length = 0;
       if(s.length() % 2 == 1) {
           length = s.length() / 2 ;
      	   answer =  s.substring(length, length + 1);
       } else {
           length = s.length() / 2;
           answer = s.substring(length-1, length + 1);
       }
        
       return answer;
    }
}