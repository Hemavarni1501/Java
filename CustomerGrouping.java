import java.util.Scanner;
class CustomerGrouping {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=src.nextInt();
        System.out.println("Gender Codes \nMale:1\nFemale:2");
        System.out.println("Enter your Gender Code: ");
        int gen=src.nextInt();
        if(gen==1){
            if(age>0 && age<25)
            System.out.println("group 1");
            else if(age>=25 && age<45)
            System.out.println("group 3");
            else 
            System.out.println("group 5");
        }
        else if(gen==2){
        if(age>0 && age<25)
            System.out.println("group 2");
            else if(age>=25 && age<45)
            System.out.println("group 4");
            else 
            System.out.println("group 5");
        }
        else
        System.out.println("invalid codes.");
        
    src.close();
    }
}