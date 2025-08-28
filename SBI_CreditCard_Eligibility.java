import java.util.Scanner;
class SBI_CreditCard_Eligibility{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Age of Primary Applicant:");
        int p_age=obj.nextInt();
        System.out.println("Enter Age of Add-on Card Applicant:");
        int age=obj.nextInt();
        System.out.println("Employment Type: \n1.Salaried \n2.Self-Employed \n3.Student \n4.Retired pensioner");
        System.out.println("Enter Employment Type Code:");
        int e_code=obj.nextInt();
        System.out.println("Enter Annual Income:");
        int income=obj.nextInt();
        if(p_age>=21 && p_age<=60&&age>18&&income>=300000&&(e_code==1||e_code==2||e_code==3||e_code==4)){
            System.out.println("Yes. You are eligible for SBI credit cards");
        }
        else{
            System.out.println("No. You are not eligible for SBI credit cards");
        }
        obj.close();

    }
}