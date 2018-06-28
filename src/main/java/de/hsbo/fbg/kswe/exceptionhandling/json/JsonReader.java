
package de.hsbo.fbg.kswe.exceptionhandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class JsonReader {

    public JsonReader() {
    }

    public List<?> read(String string) throws IOException {
        return new ObjectMapper().readValue(string, List.class);
    }

    public List<?> read(URL resource) throws IOException {
        return new ObjectMapper().readValue(resource.openStream(), List.class);
    }

}
