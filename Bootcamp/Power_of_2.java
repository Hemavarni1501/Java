import java.util.*;
public class Power_of_2 {
    public static boolean two(int n){  
        if((n & n-1) == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean a=two(n);
        if(a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
