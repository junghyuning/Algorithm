class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a+b+c;
        if(a!=b && b!=c && a!=c){
            answer = sum;
        } else if (a==b && b==c && a==c){
            answer = (int)(sum * (Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))
                *(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)));
        } else {
            answer = (int)(sum * (Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)));
        }
        return answer;
    }
}