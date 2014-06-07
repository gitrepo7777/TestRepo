package com.mkyong.ws;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ImageClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// http://localhost:8080/RPC-MTOM/ImageServerImpl
		URL url = new URL("http://localhost:8080/RPC-MTOM/ImageServerImpl?wsdl");
		QName qname = new QName("http://ws.mkyong.com/",
				"ImageServerImplService");

		Service service = Service.create(url, qname);
		ImageServer imageServer = service.getPort(ImageServer.class);

		/************ test download ***************/
		Image image = imageServer.downloadImage("C:/JunoWorkspace/RPC-MTOM/src/Desert.jpg");

		// display it in frame
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		JLabel label = new JLabel(new ImageIcon(image));
		frame.add(label);
		frame.setVisible(true);

		System.out
				.println("imageServer.downloadImage() : Download Successful!");
	}

}
