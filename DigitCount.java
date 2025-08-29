import java.util.*;
class DigitCount{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=obj.nextInt();
        int step=0;
        while(n>0){
            n=n/10;
            step++;
        }
        System.out.println("Number of digits: "+step);
        obj.close();
    }
}