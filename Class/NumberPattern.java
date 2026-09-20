public class NumberPattern {
public static void main(String[] args) {
    int i,j,b=1;
    System.out.println("METHOD-1");
    for(i=1;i<=4;i++){
    for(j=1;j<=i;j++){
        if(b==10)
        {
            b=0;
        }
        System.out.print((b++)+" ");
    }
    System.out.println();
}
    System.out.println("METHOD-2");
    for(i=1;i<=4;i++){
    for(j=1;j<=i;j++){
        System.out.print(b%10+" ");
        b++;
    }
System.out.println();
}
    }
}    

