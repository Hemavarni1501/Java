import java.util.*;
public class Unique_word {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String[] a=st.split(" ");
        HashMap<String,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        int c=0;
        for(int i=0;i<a.length;i++){
            if(m.get(a[i])==1){
                System.out.println(a[i]);
                break;
            }
            c++;
        }
        if(c==a.length-1){
            System.out.println(-1);
        }
    }
}
