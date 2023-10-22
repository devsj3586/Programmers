import java.util.*;

class Solution {
    public List solution(String myString) {
        String[] splitstr = myString.split("x");
        List<String> answer = new ArrayList<>();
        
        for(String s : splitstr) {
          if(!s.isEmpty()) {
              answer.add(s);
            }  
         }
        Collections.sort(answer);
        return answer;
    }
}