import java.util.Scanner;
public class ArrayPrime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of Elements in the Array");
    int num = sc.nextInt();
    int[] a=new int[num];
    System.out.println("Enter Elements of Array:");
    int i,b=0;
    for(i=0;i<num;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Prime Numbers in the Array are:");
        for(int j=0;j<num;j++){
    int sq=(int)Math.sqrt(a[j]);
    boolean isPrime=true;
    for(i=2;i<=sq;i++){
        if(a[j]%i==0){
            isPrime=false;
            break;
        }
        if(a[j]==1){
            isPrime=false;
            break;
        }
    }
    if(isPrime){
        b++;
        System.out.println(a[j]);
    }
}
    if(b==0){
        System.out.println("No Prime Numbers in the Array");
    }
    else{
        System.out.println("Total Prime Numbers in the Array: "+b);
    }
  sc.close();
}
    
}


