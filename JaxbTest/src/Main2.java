import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Main2 {

	public static void main(String[] args) {
		 
		 try {
	 
			File file = new File("C://Users//Y//workspace//JaxbTest//src//com//vani//file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.name + " " + customer.age + " " + customer.id);
	 
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	 
		}

}
