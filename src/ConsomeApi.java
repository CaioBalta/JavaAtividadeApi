import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ConsomeApi
{
    public String buscarDados(String cepin) throws IOException, InterruptedException
    {   
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://viacep.com.br/ws/" + cepin + "/json/"))
        .build();
        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString()); 

        return response.body();
    }
}