import java.util.*;
public class Taxi_Fare {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter distance(in km) : ");
    int fare=s.nextInt();
    System.out.print("Whether Raining(true/false) : ");
    boolean isRain=s.nextBoolean();
    System.out.print("Enter Current Time(in hr(0-23)) : ");
    int time=s.nextInt();
    int f=fare*10; int fin=f;
    if(isRain){
        int r=(f/10);
        fin+=r;
    }
    if((time>=7&&time<=9) || (time>=17&&time<=20)){
       int t =(f/10)*2;
       fin+=t;
    }
    System.out.println("To Pay (Final Fare) : "+fin);
}
}
