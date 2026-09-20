import java.util.*;
public class Max_Freq {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        } int m=0;
        for(int i=0;i<n;i++){
            if(m<map.get(a[i])){
                m=map.get(a[i]);
            }
        }
        System.out.print("High Freq : "+m);
    }
}

