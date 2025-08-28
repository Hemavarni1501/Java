import java.util.Scanner;
class MaxMinof2Nums {
    public static void main(String[] args) {
        int a,b;
        Scanner obj= new Scanner(System.in);
        System.out.println("Max & Min of 2 Numbers");
        System.out.println("Enter 2 Numbers to Check:");
        a=obj.nextInt();
        b=obj.nextInt();
        if(a>b){
            System.out.println("Max="+a+"\nMin="+b);}
        else if(b>a){
            System.out.println("Max="+b+"\nMin="+a); }
            else{
                System.out.println("Both are Equal \na="+a+" b="+b);}
        obj.close();  
    }
}