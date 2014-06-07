import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXMLDemo {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Employee.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Employee object = new Employee();
		object.setCode("CA");
		object.setName("Cath");
		object.setSalary(300);

		m.marshal(object, new FileOutputStream("result.xml"));

	}
}