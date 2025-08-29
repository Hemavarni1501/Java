import java.util.*;
class Diamond{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");  
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");  
            }
            System.out.println();
        }   
          for(i=n-1;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");  
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");  
            }
            System.out.println();
        }   
           obj.close(); 
    }
}