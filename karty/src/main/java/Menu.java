import java.util.Scanner;

public class Menu {
    private static Save save;
    public static boolean menu(){
        System.out.println("Wybierz opcje \n1.Zpis do pliku \n2. Wyświetl w konsoli");
        Scanner x=  new Scanner(System.in);
        int wybor=x.nextInt();
        if(wybor==1){
            return true;
        }
        else if(wybor==2){
            return false;
        }
        else{
            System.out.println("Frajer jesteś");
        }
        return false;
    }

    public static Save getSave() {
        return save;
    }
}
