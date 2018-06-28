
package de.hsbo.fbg.kswe.exceptionhandling.json;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Main {
    
    private static final Logger LOG = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        readString();
        readFile();
    }

    private static void readString() {
        try {
            List<?> json = new JsonReader().read("[{\"temperature\":15,\"humidity\":46.7,\"timestamp\":1509495161},"
                    + "{\"temperature\":15.1,\"humidity\":46.7,\"timestamp\":1509494860},"
                    + "{\"temperature\":15.1,\"humidity\":46.5,\"timestamp\":1509494560},"
                    + "{\"temperature\":15.1,\"humidity\":46.46,\"timestamp\":1509494260}");
            LOG.info("The JSON string is: {}", json);
        } catch (IOException ex) {
            LOG.warn("Could not read JSON", ex);
        } finally {
            LOG.info("We are done parsing JSON string");
        }
    }

    private static void readFile() {
        try {
            List<?> json = new JsonReader().read(Main.class.getResource("observations.json"));
            LOG.info("The JSON file is: {}", json);
        } catch (IOException ex) {
            LOG.warn("Could not read JSON", ex);
        } finally {
            LOG.info("We are done parsing JSON from file");
        }
    }

}
