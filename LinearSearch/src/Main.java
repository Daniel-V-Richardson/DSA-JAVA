import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i;
        int arr[] = {1,3,4,5,6,83,67};

        System.out.println("Enter the Number which you want to search:- ");
        int search = in.nextInt();

        for(i = 0; i < arr.length; i++){
            if(search == arr[i]){
                System.out.println("The Number: "+search+" is in index:- "+arr[i]);
            }
        }
//        if(search!=arr[i]){
//            System.out.println("The Number: "+search+" is not in the array");
//        }

    }
}