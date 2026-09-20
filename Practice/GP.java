import java.util.*;
public class GP {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int g=s.nextInt();
        int p=s.nextInt();
        for(int i=1;i<p;i++){
            n*=g;
        }
        System.out.println(p+"th term = "+n);
    }
}
