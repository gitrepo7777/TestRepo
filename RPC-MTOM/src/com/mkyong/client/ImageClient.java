package com.mkyong.client;
 
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import com.mkyong.ws.ImageServer;
 
public class ImageClient{
 
	public static void main(String[] args) throws Exception {
 
	URL url = new URL("http://localhost:8080/RPC-MTOM/ImageServerImpl?wsdl");
        QName qname = new QName("http://ws.mkyong.com/", "ImageServerImplService");
 
        Service service = Service.create(url, qname);
        ImageServer imageServer = service.getPort(ImageServer.class);
 
        /************  test upload ****************/
        Image imgUpload = ImageIO.read(new File("C:/JunoWorkspace/RPC-MTOM/src/Desert.jpg"));
 
        //enable MTOM in client
        BindingProvider bp = (BindingProvider) imageServer;
        SOAPBinding binding = (SOAPBinding) bp.getBinding();
        binding.setMTOMEnabled(true);
 
        String status = imageServer.uploadImage(imgUpload);
        System.out.println("imageServer.uploadImage() : " + status);
 
    }
 
}