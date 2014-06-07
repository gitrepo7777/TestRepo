package org.mpilone.spring.web.soap;

import org.mpilone.spring.web.WeatherService;
import org.mpilone.spring.web.domain.WeatherReport;
import org.mpilone.spring.web.domain.messages.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

/**
 * Implementation of the weather service endpoint that handles SOAP requests
 * using Spring Web Services.
 */
@Endpoint
public class WeatherSoapEndpoint
{
  /**
   * The weather service to delegate all requests to.
   */
  @Autowired
  private WeatherService mWeatherService;

  /**
   * The namespace for web service requests.
   */
  protected static final String WEATHER_NAMESPACE = "http://mpilone.org/weather";

  /**
   * Refer to the WeatherService for details.
   * 
   * @param request
   *          the client's unmarshalled request
   * @return the response to be marshalled
   */
  @PayloadRoot(localPart = "ConvertTemperature", namespace = WEATHER_NAMESPACE)
  public ConvertTemperatureResponse convertTemperature(
      ConvertTemperature request)
  {
    // Delegate to the business service
    float result = mWeatherService.convertTemperature(request.getTemperature(),
        request.getTargetScale());

    // Return the proper response as the model
    ConvertTemperatureResponse response = new ConvertTemperatureResponse();
    response.setResult(result);
    return response;
  }

  /**
   * Refer to the WeatherService for details.
   * 
   * @param request
   *          the client's unmarshalled request
   * @return the response to be marshalled
   */
  @PayloadRoot(localPart = "GetWeatherReport", namespace = WEATHER_NAMESPACE)
  public GetWeatherReportResponse getWeatherReport(GetWeatherReport request)
  {
    // Delegate to the business service
    WeatherReport result = mWeatherService.getWeatherReport(request
        .getZipcode());

    // Return the proper response as the model
    GetWeatherReportResponse response = new GetWeatherReportResponse();
    response.setResult(result);
    return response;
  }

  /**
   * Refer to the WeatherService for details.
   * 
   * @param request
   *          the client's unmarshalled request
   * @return the response to be marshalled
   */
  @PayloadRoot(localPart = "SaveWeatherUpdate", namespace = WEATHER_NAMESPACE)
  public SaveWeatherUpdateResponse saveWeatherUpdate(SaveWeatherUpdate request)
  {
    // Delegate to the business service
    mWeatherService.saveWeatherUpdate(request.getWeatherInfo());

    // Return the proper response as the model
    SaveWeatherUpdateResponse response = new SaveWeatherUpdateResponse();
    return response;
  }
}