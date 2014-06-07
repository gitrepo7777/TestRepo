import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.vani.Item;
import com.vani.ObjectFactory;

public class CopyOfJavaToXMLDemo {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance("com.vani");

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Item object = new Item();
		object.setCode("CAuoiuoi");
		object.setName("Cathlkjlkj");
		object.setPrice(9879879);

		m.marshal(object, new FileOutputStream("result2.xml"));

	}
}