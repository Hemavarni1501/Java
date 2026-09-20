
import java.util.Scanner;

public class Traffic_Signal {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String sig=s.next();
        if(sig.equalsIgnoreCase("red")){
            System.out.println("STOP");
        }
       else if(sig.equalsIgnoreCase("yellow")){
            System.out.println("GET READY");
        }
       else if(sig.equalsIgnoreCase("green")){
            System.out.println("GO");
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}
