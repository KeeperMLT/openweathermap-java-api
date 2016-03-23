package org.openweathermap.api.query;


public class ByCityName extends AbstractCurrentWeatherQuery {

    private final String cityName;
    private String countryCode;

    public ByCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    protected String getRequestPart() {
        if (countryCode != null) {
            return "q=" + cityName + "," + countryCode;
        }
        return "q=" + cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
