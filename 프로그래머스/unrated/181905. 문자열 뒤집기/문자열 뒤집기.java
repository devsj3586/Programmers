import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s,e+1);
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        answer = my_string.replaceAll(str, reversedStr);
        return answer;
    }
}