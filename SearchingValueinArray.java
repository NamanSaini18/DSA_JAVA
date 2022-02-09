import java.util.Scanner;

//        Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index) of search value. Do it recursively
//        The prototype of the method is as follows
//public static int find(int arr[ ], int currentIndex, int search_value)
//        {
//        // set of statements;
//        }
public class FindMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];  // Here we are specifying the size of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // We are taking the elements of the array as input from the user itself 
        }
//        int search_Value = sc.nextInt();
//        Find obj = new Find();
        System.out.println("Enter the value that you want to search in the array: ");
        System.out.println(Find.find(arr,0,sc.nextInt()));
    }

}
class Find{
    public static int find(int[] arr, int currentIndex, int search_Value){
      // Here if the value of currentindex is equal to the length of the array then in that case we will end the method after this statement
        if(currentIndex == arr.length){
            return -1;
        }
      // Here we are returning the currentIndex to check the first occurence of the value that we want to search in the array 
        if(arr[currentIndex] == search_Value){
            return currentIndex;
        }
        else{
            int n = find(arr,currentIndex+1,search_Value);   // Recursive call
            return n;
        }
    }

}
