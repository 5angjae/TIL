package homework;

import java.util.StringTokenizer;

public class AnalyzeSentence {

    public static void main(String[] args){
        AnalyzeSentence analyzer = new AnalyzeSentence();
        String sentence = "I have the strangest feeling.";
        int resultWithTrue = 0;
        int resultWithFalse = 0;
        resultWithTrue = analyzer.analyzeSentence(sentence, true);
        resultWithFalse = analyzer.analyzeSentence(sentence, false);
        
        System.out.println("결과 예상값 : 5, 실제 결과값 : "+resultWithTrue);
        System.out.println("결과 예상값 : 29, 실제 결과값 : "+resultWithFalse); 
    }
    
    public int analyzeSentence(String sentence, boolean isWord){

        //analyzeSentence 메소드 구현
        if(isWord) {
        	int cnt = 0;
        	StringTokenizer st = new StringTokenizer(sentence);
        	while(st.hasMoreTokens()) {
    			st.nextToken();
    			cnt += 1;
    		}
        	
        	return cnt;
        }else {
        	return sentence.length();
        }
    }
}
