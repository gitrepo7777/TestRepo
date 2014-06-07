package org.mpilone.spring.web;

import static java.lang.String.format;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.mpilone.spring.web.domain.WeatherReport;
import org.mpilone.spring.web.domain.WeatherUpdate;

/**
 * Implementation of the weather service that simply uses an in memory hash map
 * to store weather reports by zipcode.
 * 
 * @author mpilone
 */
public class WeatherServiceImpl implements WeatherService
{
  /**
   * The logger for this class.
   */
  private static final Logger sLog = Logger.getLogger(WeatherServiceImpl.class);

  /**
   * The map of weather reports to return by zipcode. Normally this would be
   * stored in a real database.
   */
  private HashMap<String, WeatherReport> mReports = new HashMap<String, WeatherReport>();

  /*
   * (non-Javadoc)
   * 
   * @see org.mpilone.spring.web.WeatherService#convertTemperature(float,
   * java.lang.String)
   */
  @Override
  public float convertTemperature(float temperature, String targetScale)
  {
    // Perform the conversion
    if (targetScale.equalsIgnoreCase("celcius"))
    {
      return (5 / 9.0f) * (temperature - 32);
    } else if (targetScale.equalsIgnoreCase("farenheit"))
    {
      return (9 / 5.0f) * (temperature + 32);
    } else
    {
      return -1;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.mpilone.spring.web.WeatherService#getWeatherReport(java.lang.String)
   */
  @Override
  public WeatherReport getWeatherReport(String zipcode)
  {
    sLog.info(format("Retrieving weather report for %s", zipcode));

    return mReports.get(zipcode);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.mpilone.spring.web.WeatherService#saveWeatherUpdate(org.mpilone.spring
   * .web.domain.WeatherUpdate)
   */
  @Override
  public void saveWeatherUpdate(WeatherUpdate weatherInfo)
  {
    sLog.info(format("Saving weather update from %s with comments %s",
        weatherInfo.getUsername(), weatherInfo.getComments()));

    WeatherReport report = new WeatherReport();
    report.setActivity(weatherInfo.getActivity());
    report.setScale(weatherInfo.getScale());
    report.setTemperature(weatherInfo.getTemperature());
    report.setZipcode(weatherInfo.getZipcode());

    mReports.put(report.getZipcode(), report);
  }

}
