import java.util.Scanner;
public class AgeGrouping {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of persons: ");
    int n = sc.nextInt();
    int[] age = new int[n];
    System.out.println("Enter the"+n+"Persons ages:");
    for(int i=0; i<n; i++){
        age[i] = sc.nextInt();
    }
    int baby=0, attending_school=0, adult=0;
    for(int i=0; i<n; i++){
        if(age[i]<=5){
            baby++;
        }
        else if(age[i]>5 && age[i]<=18){
            attending_school++;
        }
        else{
            adult++;
        }
    }
    System.out.println("Babies: "+baby);
    System.out.println("Attending school: "+attending_school);    
    System.out.println("Adults: "+adult);
    sc.close();
}
}
