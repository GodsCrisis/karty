import java.io.*;
import java.util.Scanner;

public class Save {
    private String nazwa ;
    private File file;

    Save(){ }
    public void ask(){
        System.out.println("Podaj nazwę pliku: ");
        nazwa=new Scanner(System.in).next();
    }
    public void creat(){
        this.file = new File(nazwa+".json");
        try {
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)
            ));
            writer.write( "[");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void save(String s){
        try {
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)
            ));
            writer.write( s + ",\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void end(){
        try {
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)
            ));
            Scanner scanner=new Scanner(file);
            String content=null;
            while(scanner.hasNextLine()){
                content= scanner.nextLine();
            }

            scanner.close();
            writer.write( content.substring(0,content.length()-1)+"]");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
