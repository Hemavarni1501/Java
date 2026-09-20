import java.util.*;
public class Payment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Your Total Amount : ");
        int a=sc.nextInt();
        System.out.println("Total Amount : "+a);
        System.out.println("---------------PAYMENT GATEWAYS-------------------");
        System.out.println("1.UPI\n2.NET BANKING\n3.CARD\n4.COD");
        int c=sc.nextInt();
        switch(c){
            case 1:{
                UPI(a);
                break;
            }
            case 2:{
                NET(a);
                break;
            }
            case 3:{
                CARD(a);
                break;
            }
            case 4:{
                System.out.println("COD Payment Picked :");
                System.out.println("Cash On Delivery(COD) Payment Confirmation");
                break;
            }
            default:{
                System.out.println("*Invalid Choice*");
            }
        }
    }
   
    static void NET(int x){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bank Name : ");
        String bn=sc.nextLine();
        System.out.println("Enter Account No : ");
        String ac=sc.nextLine();
        System.out.println("Enter IFSC Code : ");
        String ifsc=sc.nextLine();
        System.out.println(" Bank Payment Successful !");

    }
    static void CARD(int x){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Card No : ");
        String cn=sc.nextLine();
        System.out.println("Enter BAnking Name : ");
        String bn=sc.nextLine();
        System.out.println("Enter Card Expiry date : ");
        String date=sc.nextLine();
        System.out.println(" Card Payment Successful !");

    }
    static void Payment(int x){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter UPI Pin");
    int pin=sc.nextInt();
    System.out.println("Payment Successful !");
    }
   static void UPI(int x){
    Scanner sc=new Scanner(System.in);
        System.out.println("---------------UPI PAYMENT-------------------");
        System.out.println("1.G-PAY\n2.PAYtm\n3.PhonePay");
        int c=sc.nextInt();
        switch(c){
            case 1:{
                System.out.println("----------------G-PAY PAYMENT------------------");
                Payment(x);
                break;
            }
            case 2:{
                System.out.println("----------------PAYtm PAYMENT------------------");
                Payment(x);
                break;
            }
            case 3:{
                System.out.println("----------------PhonePay PAYMENT------------------");
                Payment(x);
                break;
            }
            default:{
                System.out.println("*Invalid Choice*");
            }
        }
    }
}
