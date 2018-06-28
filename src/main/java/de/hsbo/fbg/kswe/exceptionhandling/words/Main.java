
package de.hsbo.fbg.kswe.exceptionhandling.words;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Main {
    
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        String longestWord = textAnalyzer.findLongestWord("Make plans to dominate world and then take "
                + "a nap who's the baby, and i like big cats and i can not lie hit you unexpectedly so "
                + "stare at ceiling light small kitty warm kitty little balls of fur stare out the window.");
        
        // TODO: Log the longest word
    }

}
