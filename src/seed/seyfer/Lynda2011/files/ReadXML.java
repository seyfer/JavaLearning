package seed.seyfer.Lynda2011.files;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author seyfer
 */
public class ReadXML {

    public ReadXML() {

    }

    public void get() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("http://seyferseed.ru/comments/feed");

            NodeList list = doc.getElementsByTagName("title");

            System.out.println("there is " + list.getLength() + " titles");

            for (int i = 0; i < list.getLength(); i++) {
                Element item = (Element) list.item(i);
                System.out.println(" title " + item.getFirstChild().getNodeValue());

            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ReadXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ReadXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
