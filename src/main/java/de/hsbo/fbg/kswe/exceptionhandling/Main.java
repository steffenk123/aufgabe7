package de.hsbo.fbg.kswe.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Application started");

        try (InputStream is = new FileInputStream(new File("/tmp/test.txt"))) {
            while (is.available() > 0) {
                is.read();
            }
        } catch (IOException e) {
            LOG.warn("Could not read file", e);
        }

    }

}
