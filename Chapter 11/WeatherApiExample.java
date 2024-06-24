import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApiExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        String apiKey = "your_api_key_here";
        String city = "Florence";
        String uri = String.format("https://api.fakeweatherapi.com/v1/current.json?key=%s&q=%s", apiKey, city);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Weather Data: \n" + response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
