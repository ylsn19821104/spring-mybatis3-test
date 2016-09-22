import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;

/**
 * Created by hongxp on 2016/9/22.
 */
public class XPathTest {
    Document doc;
    XPath xpath;

    @Before
    public void init() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);

        DocumentBuilder db = dbf.newDocumentBuilder();
        doc = db.parse(this.getClass().getClassLoader().getResourceAsStream("demo.xml"));

        XPathFactory factory = XPathFactory.newInstance();
        xpath = factory.newXPath();
    }

    @Test
    public void rootElement() {
        try {
            Node node = (Node) xpath.evaluate("/rss", doc, XPathConstants.NODE);
            System.err.println(node.getNodeName() + "-------" + node.getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getChildElements() {
        try {
            NodeList nodeList = (NodeList) xpath.evaluate("/rss/channel/*", doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element e = (Element) nodeList.item(i);
                System.err.println(nodeList.item(i).getNodeName() + " " + nodeList.item(i).getNodeValue());
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPartElement() {
        try {
            NodeList nodeList = (NodeList) xpath.evaluate("//*[name()='title']", doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.err.println(nodeList.item(i).getNodeName() + "---" + nodeList.item(i).getTextContent());
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void haveChildsElements() {
        try {
            NodeList nodeList = (NodeList) xpath.evaluate("//*[*]", doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.err.println(nodeList.item(i).getNodeName() + "---" + nodeList.item(i).getTextContent());
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getLevelElements() {
        try {
            NodeList nodeList = (NodeList) xpath.evaluate("/*/*/*/*", doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.err.println(nodeList.item(i).getNodeName() + "---" + nodeList.item(i).getTextContent());
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAttrElements() {
        try {
            NodeList nodeList = (NodeList) xpath.evaluate("//bookstore/book[price>35]/title", doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.err.println(nodeList.item(i).getNodeName() + "---" + nodeList.item(i).getTextContent());
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
