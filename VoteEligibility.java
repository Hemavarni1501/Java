import java.util.*;
class VoteEligibility{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Voter Age Eligibility Checking Program");
        System.out.println("Enter Age to Check Voting Criteria:");
        int age= obj.nextInt();
        if(age>18&&age<150){
            System.out.println("Eligible for Voting \n Age="+age);
        }
        else{
            System.out.println("Not Eligible for Voting \n Age="+age);
        }
        System.out.println("Thankyou!");
        obj.close();
    }
}