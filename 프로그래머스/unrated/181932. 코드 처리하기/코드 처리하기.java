class Solution {
    public String solution(String code) {
        String answer = "";
        char[] codeArr = code.toCharArray();
        int mode=0;
        for(int i=0; i<code.length(); i++){
            switch(mode){
                case 0:
                    if(codeArr[i]=='1') {mode = 1;}
                    else{
                        answer += (i%2==0)?codeArr[i]:"";
                    }
                    break;
                case 1:
                    if(codeArr[i]=='1') {mode = 0;}
                    else{
                        answer += (i%2==1)?codeArr[i]:"";
                    }
                    break;
            }
                
        }
        return answer = (answer.length()==0)?"EMPTY":answer;
    }
}