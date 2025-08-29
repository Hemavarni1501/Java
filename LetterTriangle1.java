import java.util.*;
class LetterTriangle1{
    public static void main(String[] args){
        char ch='A';
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            ch='A';
            for(int j=1;j<=i;j++){
                System.out.print((ch++)+" ");  
            }
            System.out.println();
        }     
           obj.close(); 
    }
}