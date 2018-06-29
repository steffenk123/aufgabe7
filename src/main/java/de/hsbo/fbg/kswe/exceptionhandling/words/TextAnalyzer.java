
package de.hsbo.fbg.kswe.exceptionhandling.words;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class TextAnalyzer {

    public TextAnalyzer() {
    }

    public String findLongestWord(String text) {
    	
    	String[] splitText = text.split(" ");
    	String longestWord = "";
    	
    	for(String word : splitText) {
    		if(word.length() > longestWord.length()) {
    			longestWord = word;
    		}
    	}
    	
    	
        return longestWord;
    }

}
