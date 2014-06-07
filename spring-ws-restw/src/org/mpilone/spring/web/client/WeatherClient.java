package org.mpilone.spring.web.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * A simple client that uses Spring's RestTemplate to call the WeatherService
 * using both the XML REST API and the JSON REST API.
 * 
 * @author mpilone
 */
public class WeatherClient
{

  /**
   * Main application entry point.
   * 
   * @param args
   *          command line arguments
   */
  public static void main(String[] args)
  {
    // Configure the rest operations. A String HttpMessageConverter is used
    // for all requests in this example but in a real application the
    // proper converters would be used based on the specific server API
    // the client was targeting. The RestTemplate can be configured in
    // a Spring application context for more complex deployments.
    RestTemplate restOps = new RestTemplate();
    StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
    List<MediaType> mediaTypes = new ArrayList<MediaType>();
    
    HttpMessageConverter[] mcArray = new HttpMessageConverter[] { stringConverter };
   
    
    restOps.setMessageConverters(new HttpMessageConverter[] { stringConverter });

    // XML Client
    mediaTypes.add(MediaType.parseMediaType("application/xml"));
    stringConverter.setSupportedMediaTypes(mediaTypes);

    String xmlRequest = "<weat:ConvertTemperature xmlns:weat=\"http://mpilone.org/weather\">\r\n"
        + "   <weat:temperature>38</weat:temperature>\r\n"
        + "   <weat:targetScale>celcius</weat:targetScale>\r\n"
        + "</weat:ConvertTemperature>";

    String xmlResponse = restOps.postForObject(
        "http://localhost:8080/weather/xml/convertTemperature", xmlRequest,
        String.class);
    System.out.println(xmlResponse);

    // JSON Client
    mediaTypes.clear();
    mediaTypes.add(MediaType.parseMediaType("application/json"));
    stringConverter.setSupportedMediaTypes(mediaTypes);

    String jsonRequest = "{ \"temperature\": 38, \"targetScale\": \"celcius\" }";
    String jsonResponse = restOps.postForObject(
        "http://localhost:8080/weather/json/convertTemperature", jsonRequest,
        String.class);
    System.out.println(jsonResponse);
  }
}
