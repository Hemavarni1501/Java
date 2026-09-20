import java.util.Scanner;
class ex
{
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=count(num);
        for(int i=1;i<=n;i++){
           int a= rotate(num);
           boolean ans=isPrime(a);
           if(ans==false)
            break;
           else
            System.out.println(a);
        }
        sc.close();
    }
    public static boolean isPrime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
    public static int rotate(int w){
        return w;
    }
}