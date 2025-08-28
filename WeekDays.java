import java.util.*;
class WeekDays{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("WeekDays SwitchCase");
        System.out.println("Enter Number to Print the Day:");
        int num= obj.nextInt();
        switch (num){
            case 1:{
                System.out.println("Day:1\nSunday");
                break;
            }
            case 2:{
                System.out.println("Day:2\nMonday");
                break;
            }
            case 3:{
                System.out.println("Day:3\nTuesday");
                break;
            }
            case 4:{
                System.out.println("Day:4\nWednesday");
                break;
            }
            case 5:{
                System.out.println("Day:5\nThursday");
                break;
            }
            case 6:{
                System.out.println("Day:6\nFriday");
                break;
            }
            case 7:{
                System.out.println("Day:7\nSaturday");
                break;
            }
            default:{
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Thankyou!");
        obj.close();
    }
}