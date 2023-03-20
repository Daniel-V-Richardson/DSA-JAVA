import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        int array[] = {10,20,30,40,60,50,2,1,4,6};
        System.out.println("Which Element you want to search:- ");
        int search = in.nextInt();
        System.out.println("Enter the Start and the end index:- ");
        int start = in.nextInt();
        int end = in.nextInt();

        int ans  = linearSearchWithRange(array,search,start,end);
        System.out.println(ans);
    }

     static int linearSearchWithRange(int arr[], int searchItem, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == searchItem){
                return i;
            }
        }
        return -1;
    }
}

