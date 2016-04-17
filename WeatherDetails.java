import WeatherPackage.APIClient;
import WeatherPackage.Forecast;
import WeatherPackage.Weather;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class WeatherDetails {
    
    String currentTemperatureInF;
    String currentWeatherCondition;
    
   Yolo()
        {
               System.out.println("GAANDU");

        APIClient.getAPI().getWeather(new Callback<Weather>() {
            @Override
            public void success(Weather weather, Response response) {
                
                currentTemperatureInF = weather.getQuery().getResults().getChannel().getItem().getCondition().getTemp();
                currentWeatherCondition = weather.getQuery().getResults().getChannel().getItem().getCondition().getText();
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                retrofitError.printStackTrace();
            }
        });
           }

}
