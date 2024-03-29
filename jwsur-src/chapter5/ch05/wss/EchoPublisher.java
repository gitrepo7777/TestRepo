package ch05.wss;

import javax.xml.ws.Endpoint;
import javax.xml.ws.Binding;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.LinkedList;
import javax.xml.ws.handler.Handler;

public class EchoPublisher {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new Echo());
        Binding binding = endpoint.getBinding();    

        List<Handler> hchain = new LinkedList<Handler>();
        hchain.add(new EchoSecurityHandler());
        binding.setHandlerChain(hchain);

        endpoint.publish("http://localhost:7777/echo");
        System.out.println("http://localhost:7777/echo");
    }
}
