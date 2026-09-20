import java.util.*;
public class Remove_Duplicates {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next();
        char[] a=st.toCharArray();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        Iterator<Character> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        
    }
}
