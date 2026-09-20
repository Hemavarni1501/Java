import java.util.*;

public class rank {
    public static void main(String args[]) {
        int[] r = {100,100,50,40,40,20,10};
        int[] p = {5,25,50,120};
        List<Integer> ranked = new ArrayList<>();
        ranked.add(r[0]);
        for(int i = 1; i < r.length; i++){  //ranked[]={100,50,40,20,10}
            if(r[i] != r[i-1]){
                ranked.add(r[i]);
            }
        }
        int in = ranked.size() - 1;    //4
        for(int i = 0; i < p.length; i++){
            while(in >= 0 && p[i] >= ranked.get(in)){ 
                in--;
            }
            System.out.print((in + 2) + " ");
        }
    }
}
