import org.junit.Before;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * Created by hongxp on 2016/9/22.
 */
public class StaxTest {
    XMLInputFactory factory;
    XMLStreamReader reader;

    @Before
    public void init() throws XMLStreamException {
        factory = XMLInputFactory.newFactory();
        reader = factory.createXMLStreamReader(this.getClass().getClassLoader().getResourceAsStream("demo.xml"));
    }
}
