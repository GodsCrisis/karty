import java.io.*;
import java.util.Scanner;

public class Save {
    private String nazwa ;
    Save(){ }
    public void ask(){
        System.out.println("Podaj nazwę pliku: ");
        nazwa=new Scanner(System.in).next();
    }
    public void save(String s){
        File file = new File(nazwa+".json");
        try {
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)
            ));
            writer.write( s + ",\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
