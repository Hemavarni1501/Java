import java.util.*;
class LetterSquare1{
    public static void main(String[] args){
        char ch='A';
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            ch='A';
            for(int j=0;j<n;j++){
                System.out.print((ch++)+" ");  
            }
            System.out.println();
        }     
           obj.close(); 
    }
}