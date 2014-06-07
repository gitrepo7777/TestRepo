import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.vani.Item;

public class CopyOfUnmarshallingDemo {

    public static void main (String [] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance ("com.vani");

            Unmarshaller u = jc.createUnmarshaller ();

           File f = new File ("item2.xml");
           JAXBElement element = (JAXBElement) u.unmarshal (f);

           Item item = (Item) element.getValue ();
           System.out.println (item.getCode ());
           System.out.println (item.getName ());
           System.out.println (item.getPrice ());
     } catch (JAXBException e) {
           e.printStackTrace ();
       }
   }
}