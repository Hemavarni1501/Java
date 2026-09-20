import java.util.*;
public class List_Reverse {
    public static void main(String[] args){
    List<String> l=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=0;i<n;i++){
        l.add(s.next());
    }
    Collections.reverse(l);
    System.out.print(l);
    }
}
