import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class CardService {
    public static void cardService(){
        URL url = null;
        try {
            url = new URL("https://api.magicthegathering.io/v1/cards");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            StringBuilder inline = new StringBuilder();

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                inline.append(scanner.nextLine());
            }
            scanner.close();
            JSONParser parser = new JSONParser();
            JSONObject data_obj = (JSONObject) parser.parse(inline.toString());
            JSONArray karty = (JSONArray) data_obj.get("cards");
            boolean save = Menu.menu();
            Save save2 = new Save();
            if (save) {
                save2.ask();
            }

            for (Object o : karty) {
                JSONObject newObject = (JSONObject) o;
                try {
                    Card card = new Card(newObject.get("name").toString(),
                            newObject.get("type").toString(),
                            newObject.get("manaCost").toString(),
                            newObject.get("colors").toString(),
                            newObject.get("imageUrl").toString(),
                            Integer.parseInt(newObject.get("toughness").toString()),
                            Integer.parseInt(newObject.get("power").toString()));
                            if(save==true){

                                save2.save(card.toString());
                            }
                            else{
                                System.out.println(card.toString());
                            }

                } catch (NumberFormatException | NullPointerException e) {
                    try {
                        Card card = new Card(newObject.get("name").toString(),
                                newObject.get("type").toString(),
                                newObject.get("manaCost").toString(),
                                newObject.get("colors").toString(),
                                newObject.get("imageUrl").toString());
                        if(save==true){

                            save2.save(card.toString());
                        }
                        else{
                            System.out.println(card.toString());
                        }
                    } catch (NullPointerException ignored) {
                    }

                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}