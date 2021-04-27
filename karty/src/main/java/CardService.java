/*import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class CardService {
    private String url;

    public CardService(String url) throws IOException {
        this.url=url;
    }


    try {
        URL url = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        StringBuilder inline= new StringBuilder();
        Scanner scanner=new Scanner(url.openStream());
        while(scanner.hasNext()){
            inline.append(scanner.nextLine());
        }
    }
    catch (IOException | ParseException ignored ) {
    }
}*/