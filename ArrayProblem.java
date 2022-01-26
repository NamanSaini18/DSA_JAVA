import java.util.Scanner;

//Write a short Java function that takes an array of int values as an argument and
//        determines if there is a pair of numbers in the array whose product is odd.
class MAIN{
    public static void main(String[] args) {5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        checkPair obj = new checkPair();
        if(obj.check(arr)){
            System.out.println("YES");
        }
        else
            System.out.println("No");

    }
}
class checkPair {
    public boolean check(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] * arr[i+1] %2 != 0){
                return true;
            }
        }
        return false;

    }

}
