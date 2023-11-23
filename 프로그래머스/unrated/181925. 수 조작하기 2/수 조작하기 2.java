class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=0; i<numLog.length-1 ; i++){
            switch(numLog[i+1]-numLog[i]){
                    case(1):
                    answer = answer.concat("w");
                    break;
                    case(-1):
                    answer = answer.concat("s");
                    break;
                    case(10):
                    answer = answer.concat("d");
                    break;
                    case(-10):
                    answer = answer.concat("a");
                    break;
            }
        }
        return answer;
    }
}