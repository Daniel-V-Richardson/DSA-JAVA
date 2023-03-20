import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] array = {20,30,2,12,34,15,16,60,23};
        System.out.println("Enter the Search Element:- ");
        int search_element = in.nextInt();

        int ans =  linearSearch(array,search_element);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int search_element){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            if( arr[i] == search_element){
                return i;
            }
        }
        return -1;

    }
}
