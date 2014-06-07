package org.mpilone.spring.web.rest;

import org.mpilone.spring.web.WeatherService;
import org.mpilone.spring.web.domain.WeatherReport;
import org.mpilone.spring.web.domain.messages.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * Implementation of the weather service endpoint that support message payloads
 * in XML or JSON. The endpoint implementation simply delegates out to the
 * weather service business logic.
 */
@Controller
public class WeatherRestEndpoint
{
  /**
   * The weather service to delegate all requests to.
   */
  @Autowired
  private WeatherService mWeatherService;

  /**
   * The marshaling view that will handle converting the model to the
   * appropriate format for returning to the user.
   */
  @Autowired
  private View mView;

  /**
   * Refer to the WeatherService for details.
   * 
   * @param request
   *          the client's unmarshalled request
   * @return the response to be marshalled
   */
  @RequestMapping(value = "/convertTemperature", method = RequestMethod.POST)
  public ModelAndView convertTemperature(@RequestBody ConvertTemperature request)
  {
    // Delegate to the business service
    float result = mWeatherService.convertTemperature(request.getTemperature(),
        request.getTargetScale());

    // Return the proper response as the model
    ConvertTemperatureResponse response = new ConvertTemperatureResponse();
    response.setResult(result);
    return new ModelAndView(mView, "response", response);
  }

  /**
   * Refer to the WeatherService for details.
   * 
   * @param request
   *          the client's unmarshalled request
   * @return the response to be marshalled
   */
  @RequestMapping(value = "/getWeatherReport", method = RequestMethod.POST)
  public ModelAndView getWeatherReport(@RequestBody GetWeatherReport request)
  {
    // Delegate to the business service
    WeatherReport result = mWeatherService.getWeatherReport(request
        .getZipcode());

    // Return the proper response as the model
    GetWeatherReportResponse response = new GetWeatherReportResponse();
    response.setResult(result);
    return new ModelAndView(mView, "response", response);
  }

  /**
   * Refer to the WeatherService for details.
   * 
   * @param request
   *          the client's unmarshalled request
   * @return the response to be marshalled
   */
  @RequestMapping(value = "/saveWeatherUpdate", method = RequestMethod.POST)
  public ModelAndView saveWeatherUpdate(@RequestBody SaveWeatherUpdate request)
  {
    // Delegate to the business service
    mWeatherService.saveWeatherUpdate(request.getWeatherInfo());

    // Return the proper response as the model
    SaveWeatherUpdateResponse response = new SaveWeatherUpdateResponse();
    return new ModelAndView(mView, "response", response);
  }
}