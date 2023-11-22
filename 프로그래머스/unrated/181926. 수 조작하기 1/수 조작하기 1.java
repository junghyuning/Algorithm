class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] controlArr = control.toCharArray();
        for(char c : controlArr){
            switch(c){
                case('w'):
                    n+=1;
                    break;
                case('s'):
                    n-=1;
                    break;
                case('d'):
                    n+=10;
                    break;
                case('a'):
                    n-=10;
                    break;
                    
            }
                
                    
        }
        return answer=n;
    }
}