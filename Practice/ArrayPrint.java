import java.util.*;
public class ArrayPrint {
    public static void main(String[] args){
        int[] a={1,2,5,3};
        int[] b={5,7,2,3};
        int[] c={5,7,1,3};
        PrintArray(a,b,c);
    }
    static void PrintArray(int[] a,int[] b, int[] c){
        String s1=Arrays.toString(a);
        String s2=Arrays.toString(b);
        String s3=Arrays.toString(c);
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(s1.contains(Integer.toString(a[i]))&&s2.contains(Integer.toString(a[i]))&&s3.contains(Integer.toString(a[i]))){
                if(!l.contains(a[i])){
                l.add(a[i]);
            }
            }
            else if(s1.contains(Integer.toString(a[i]))&&s2.contains(Integer.toString(a[i]))||s1.contains(Integer.toString(a[i]))&&s3.contains(Integer.toString(a[i]))||s3.contains(Integer.toString(a[i]))&&s2.contains(Integer.toString(a[i]))){
                if(!l1.contains(a[i])){
                l1.add(a[i]);
                }
            }
        }
        for(int i=0;i<b.length;i++){
            if(s1.contains(Integer.toString(b[i]))&&s2.contains(Integer.toString(b[i]))&&s3.contains(Integer.toString(b[i]))){
                if(!l.contains(b[i])){
                l.add(b[i]);
                }
            }
            else if(s1.contains(Integer.toString(b[i]))&&s2.contains(Integer.toString(b[i]))||s1.contains(Integer.toString(b[i]))&&s3.contains(Integer.toString(b[i]))||s3.contains(Integer.toString(b[i]))&&s2.contains(Integer.toString(b[i]))){
                if(!l1.contains(b[i])){
                l1.add(b[i]);
                }
            }
        }
        for(int i=0;i<c.length;i++){
            if(s1.contains(Integer.toString(c[i]))&&s2.contains(Integer.toString(c[i]))&&s3.contains(Integer.toString(c[i]))){
                if(!l.contains(c[i])){
                l.add(c[i]);
                }
            }
            else if(s1.contains(Integer.toString(c[i]))&&s2.contains(Integer.toString(c[i]))||s1.contains(Integer.toString(c[i]))&&s3.contains(Integer.toString(c[i]))||s3.contains(Integer.toString(c[i]))&&s2.contains(Integer.toString(c[i]))){
                if(!l1.contains(c[i])){
                l1.add(c[i]);
                }
            }
        }
        for(int w:l1){
            if(!l.contains(w)){
            l.add(w);
            }
        }
        for(int w:l){
            System.out.print(w+" ");
        }
    }
}
