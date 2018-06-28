
package de.hsbo.fbg.kswe.exceptionhandling.error;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Main {
    
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        RecursiveAlgorithm recursion = new RecursiveAlgorithm();
        
        try {
            recursion.runCalculation();
        } catch (Exception e) {
            LOG.warn("Error in execution", e);
        } finally {
            LOG.info("Continuing after the calculation call");
        }
        
    }
    
}
