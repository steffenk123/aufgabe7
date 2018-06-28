
package de.hsbo.fbg.kswe.exceptionhandling.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Main {
    
    private static final Logger LOG = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        Integer[] theArray = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double mean = new ArrayStatisticCalculator().meanOfSubArray(theArray, 4, 6);
        LOG.info("The mean of {} subsetted from {} to {} is: {}", theArray, 4, 6, mean);
        
        mean = new ArrayStatisticCalculator().meanOfSubArray(theArray, 8, 11);
        LOG.info("The mean of {} subsetted from {} to {} is: {}", theArray, 8, 11, mean);
    }

}
