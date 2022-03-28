import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch find = new BinarySearch();
        System.out.println("Enter the size of the array:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array entered by you is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);

        System.out.println("Enter the value that you want to find in the given sequence: ");
        int key = sc.nextInt();
        int last = arr.length-1;
        find.binarySearch(arr,0,last,key);

    }
}
class BinarySearch
{
    public void binarySearch(int[] arr, int first, int last, int key)
    {
        int mid = (first+last)/2;
        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first = mid+1;
            }
            else if(arr[mid] == key)
            {
                System.out.println("Required key found successfully");
                System.out.println("Element found at the index:"+ mid);
                break;
            }
            else
            {
                last= mid-1;

            }
            mid = (first+last)/2;
        }
        if(first>last)
        {
            System.out.println("Required key is not found in the sequence!!!");
            System.out.println("Please try again later O_O");
        }

    }

}
