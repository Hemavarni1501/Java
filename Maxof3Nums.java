import java.util.Scanner;
class Maxof3Nums{
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.println("Max of 3 Numbers");
        System.out.println("Enter 3 Numbers to Check:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>=b && a>=c){
            System.out.println("Max="+a);}
        else if(b>=a && b>=c){
            System.out.println("Max="+b); }
        else{
            System.out.println("Max="+c);}
        obj.close();
    }
}