
package de.hsbo.fbg.kswe.exceptionhandling.arrays;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class ArrayStatisticCalculator {

    public ArrayStatisticCalculator() {
    }

    /**
     * calculate the mean of a sub-portion of the given Number array
     * 
     * @param theArray
     * @param startIndex the start index (inclusive)
     * @param endIndex the end index (exclusive)
     * @return the mean as a double
     */
    public double meanOfSubArray(Number[] theArray, int startIndex, int endIndex) {
        double sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += theArray[i].doubleValue();
        }
        
        return sum / (endIndex - startIndex);
    }

}
