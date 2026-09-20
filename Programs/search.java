import java.util.Scanner;

public class search {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array:");
        int r=sc.nextInt();
        System.out.println("Enter Col Size of the Array:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter "+(r*c)+" Numbers:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Key to be Searched:");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<r;i++){   
            for(int j=0;j<c;j++){
                 if(a[i][j]==key){
                     System.out.println("Key Found at Index: ("+i+","+j+")");
                     found=true;
                     break;
                 }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Key Not Found");
        }   
        sc.close();
    }
}
