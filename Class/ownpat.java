import java.util.Scanner;
public class ownpat
{
    public static void main(String[] args)
    {   int n=1;
        int l =0;
        Scanner ok = new Scanner(System.in);
        System.out.println("enter row");
        int r = ok.nextInt();
        for(int i=1;i<=r;i++)
       {
       if(n%2==0)
       { 
        for(int j=1;j<=n+1-l;j++)
            {
                System.out.print("* ");
            }
            ++n;
            System.out.println(" ");
            l++;
            }
       else
       {    
        for(int j=1;j<=n-l;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
            ++n;
            }
       }
    }
}