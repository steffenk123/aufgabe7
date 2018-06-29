package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import de.hsbo.fbg.kswe.exceptionhandling.words.TextAnalyzer;

class TextAnalyzerTest {

	@Test
	public void textAnalyzerTest() {
		TextAnalyzer textAnalyzer = new TextAnalyzer();
        String longestWord = textAnalyzer.findLongestWord("Make plans to dominate world and then take "
                + "a nap who's the baby, and i like big cats and i can not lie hit you unexpectedly so "
                + "stare at ceiling light small kitty warm kitty little balls of fur stare out the window.");
        
        Assert.assertEquals("unexpectedly", longestWord);
	}

}
