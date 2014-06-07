package org.mpilone.spring.web;

import org.mpilone.spring.web.domain.WeatherReport;
import org.mpilone.spring.web.domain.WeatherUpdate;

/**
 * Interface for the weather service which support simple weather related
 * operations. Each remote weather sensor can use the service to record the
 * local weather and return information about weather in other locations.
 * 
 * @author mpilone
 */
public interface WeatherService
{

  /**
   * Converts the given temperature to the new scale. This method assumes that
   * the given temperature is in the opposite scale before conversion.
   * 
   * @param value
   *          the temperature value
   * @param scale
   *          the target scale ("celcius" or "fahrenheit")
   * @return the new temperature value
   */
  public float convertTemperature(float value, String scale);

  /**
   * Gets the weather report for the given zipcode. If no report has been
   * recorded for the zipcode, null is returned.
   * 
   * @param zipcode
   *          the zipcode to get the report for
   * @return the report or null
   */
  public WeatherReport getWeatherReport(String zipcode);

  /**
   * Saves a weather update for the given zipcode. If a report already exists
   * for the zipcode, it will be replaced.
   * 
   * @param update
   *          the update to save
   */
  public void saveWeatherUpdate(WeatherUpdate update);
}
