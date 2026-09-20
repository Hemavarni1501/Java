import java.util.*;
public class String_freq {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String s1=s.nextLine();
        String[] a=st.split(" ");
        int c=0;
        for(int i=0;i<a.length;i++){
            if(s1.equals(a[i])){
                c++;
            }
        }
        System.out.println("count="+c);
    }
}
