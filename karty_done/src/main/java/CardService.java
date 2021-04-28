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
            int wybor=Menu.menu2();
            Save save2 = new Save();
            if (save) {
                save2.ask();
                save2.creat();
            }
            for (Object o : karty) {
                JSONObject newObject = (JSONObject) o;
                try {
                    Card card = new Card(newObject.get("name").toString(),
                            newObject.get("type").toString(),
                            newObject.get("manaCost").toString(),
                            newObject.get("colors").toString(),
                            newObject.get("imageUrl").toString(),
                            newObject.get("toughness").toString(),
                            newObject.get("power").toString());
                            if(save==true){
                                switch(wybor){
                                    case 1: {
                                        save2.save(card.getName());
                                        save2.save(card.getType());
                                        break;
                                    }
                                    case 2: {
                                        save2.save(card.getName());
                                        save2.save(card.getManaCost());
                                        break;
                                    }
                                    case 3:{
                                        save2.save(card.getName());
                                        save2.save(card.getColors());
                                        break;
                                    }
                                    case 4:{
                                        save2.save(card.getName());
                                        save2.save(String.valueOf(card.getToughness()));
                                        break;
                                    }
                                    case 5:{
                                        save2.save(card.getName());
                                        save2.save(String.valueOf(card.getPower()));
                                        break;
                                    }
                                    case 6:{
                                        save2.save(card.getName());
                                        save2.save(card.getImgLink());
                                        break;
                                    }
                                    default:{
                                        save2.save(card.toString());
                                        break;
                                    }
                                }
                            }
                            else{
                                switch(wybor){
                                    case 1: {
                                        System.out.println(card.getName());
                                        System.out.println(card.getType());
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(card.getName());
                                        System.out.println(card.getManaCost());
                                        break;
                                    }
                                    case 3:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getColors());
                                        break;
                                    }
                                    case 4:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getToughness());
                                        break;
                                    }
                                    case 5:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getPower());
                                        break;
                                    }
                                    case 6:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getImgLink());
                                        break;
                                    }
                                    default:{
                                        System.out.println(card.toString());
                                        break;
                                    }
                                }
                            }

                } catch (NumberFormatException | NullPointerException e) {
                    try {
                        Card card = new Card(newObject.get("name").toString(),
                                newObject.get("type").toString(),
                                newObject.get("manaCost").toString(),
                                newObject.get("colors").toString(),
                                newObject.get("imageUrl").toString());
                        if(save==true){

                            switch(wybor){
                                case 1: {
                                    save2.save(card.getName());
                                    save2.save(card.getType());
                                    break;
                                }
                                case 2: {
                                    save2.save(card.getName());
                                    save2.save(card.getManaCost());
                                    break;
                                }
                                case 3:{
                                    save2.save(card.getName());
                                    save2.save(card.getColors());
                                    break;
                                }
                                case 4:{
                                    save2.save(card.getName());
                                    save2.save(String.valueOf(card.getToughness()));
                                    break;
                                }
                                case 5:{
                                    save2.save(card.getName());
                                    save2.save(String.valueOf(card.getPower()));
                                    break;
                                }
                                case 6:{
                                    save2.save(card.getName());
                                    save2.save(card.getImgLink());
                                    break;
                                }
                                default:{
                                    save2.save(card.toString());
                                    break;
                                }
                            }
                        }
                        else{
                                switch(wybor){
                                    case 1: {
                                        System.out.println(card.getName());
                                        System.out.println(card.getType());
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(card.getName());
                                        System.out.println(card.getManaCost());
                                        break;
                                    }
                                    case 3:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getColors());
                                        break;
                                    }
                                    case 4:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getToughness());
                                        break;
                                    }
                                    case 5:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getPower());
                                        break;
                                    }
                                    case 6:{
                                        System.out.println(card.getName());
                                        System.out.println(card.getImgLink());
                                        break;
                                    }
                                    default:{
                                        System.out.println(card.toString());
                                        break;
                                    }
                                }
                            }

                    } catch (NullPointerException ignored) {
                    }

                }
            }
            if(save){
                save2.end();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}