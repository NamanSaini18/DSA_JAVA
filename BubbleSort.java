import java.util.Scanner;

public class Sorting {
    public static void PrintArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr);
    }
}
