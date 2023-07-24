class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = (a+"") + b;
        String d = (b+"") + a;
        if (Integer.valueOf(c) > Integer.valueOf(d)) {
            return answer += Integer.valueOf(c);
        } else {
            return answer += Integer.valueOf(d);
        }
        
    }
}