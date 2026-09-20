import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        /*System.out.println("Enter the element to be Deleted: ");
        int ele=obj.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==ele){
                for(int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
                size--;
                i--;
            }
        }*/
        System.out.println("Enter the Position to Delete:");
        int pos=obj.nextInt();
        for(int i=pos;i<size;i++){
            arr[i-1]=arr[i];
        }
        System.out.println("Array after Deletion: ");
        for(int i=0;i<size-1;i++){   
            System.out.print(arr[i]+" ");
        }
        obj.close();
    }
}
