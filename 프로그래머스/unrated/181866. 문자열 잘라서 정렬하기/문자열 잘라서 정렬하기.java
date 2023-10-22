import java.util.*;

class Solution {
    public List solution(String myString) {
        String[] split = myString.split("x");
        List<String> answer = new ArrayList<>();
        
        for(String s : split) {
          if(!s.isEmpty()) {
              answer.add(s);
            }  
         }
        Collections.sort(answer);
        return answer;
    }
}