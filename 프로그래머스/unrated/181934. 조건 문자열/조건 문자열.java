class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean tf=false;
        switch(ineq){
            case(">"):
                tf=(eq.equals("=")) ? n>=m : n>m;
                break;
            case("<"):
                tf=(eq.equals("=")) ? n<=m : n<m;
                break;
            }
        
        return answer = (tf) ? 1 : 0;
    }
}